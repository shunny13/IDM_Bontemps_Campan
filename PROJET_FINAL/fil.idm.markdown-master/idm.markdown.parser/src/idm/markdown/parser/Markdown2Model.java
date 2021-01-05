/**
 * 
 */
package idm.markdown.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.IndentedCodeBlock;
import com.vladsch.flexmark.ast.LinkRef;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;

import idm.simplemarkdown.mm.simplemarkdown.Block;
import idm.simplemarkdown.mm.simplemarkdown.BlockQuote;
import idm.simplemarkdown.mm.simplemarkdown.BulletList;
import idm.simplemarkdown.mm.simplemarkdown.BulletListItem;
import idm.simplemarkdown.mm.simplemarkdown.Code;
import idm.simplemarkdown.mm.simplemarkdown.CodeBlock;
import idm.simplemarkdown.mm.simplemarkdown.CodeLine;
import idm.simplemarkdown.mm.simplemarkdown.Document;
import idm.simplemarkdown.mm.simplemarkdown.Emphasis;
import idm.simplemarkdown.mm.simplemarkdown.HorizontalLine;
import idm.simplemarkdown.mm.simplemarkdown.Image;
import idm.simplemarkdown.mm.simplemarkdown.Link;
import idm.simplemarkdown.mm.simplemarkdown.LinkWithRef;
import idm.simplemarkdown.mm.simplemarkdown.ListItemElement;
import idm.simplemarkdown.mm.simplemarkdown.OrderedList;
import idm.simplemarkdown.mm.simplemarkdown.OrderedListItem;
import idm.simplemarkdown.mm.simplemarkdown.Paragraph;
import idm.simplemarkdown.mm.simplemarkdown.Reference;
import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory;
import idm.simplemarkdown.mm.simplemarkdown.Text;
import idm.simplemarkdown.mm.simplemarkdown.TextElement;
import idm.simplemarkdown.mm.simplemarkdown.Title;

/**
 * Parse a Markdown file and create corresponding model.
 * 
 * The main method is {@link #parseFile(FileReader, Document)}. It takes the file to parse, and 
 * the {@link Document} to fill.
 * 
 * All "visit()" methods are used to visit a node of the parsed AST.
 * 
 * To add a concept to parse, one must add the corresponding visit(ConceptType) method.
 * The method must also be registered in the {@link #visitor} object.
 * 
 * @author dumoulin
 *
 */
public class Markdown2Model {

	/**
	 * Root document of the MM
	 * 
	 */
	private Document rootDoc;
	
	
	
	/**
	 * Stack to track the current parent element
	 */
	protected Stack parentsStack = new Stack();
	
	/**
	 * 
	 */
	protected com.vladsch.flexmark.util.ast.Visitor<Node> v;
	
    // example of visitor for a node or nodes, just add VisitHandlers<> to the list
    // any node type not handled by the visitor will default to visiting its children
    NodeVisitor visitor = new NodeVisitor(
            new VisitHandler<>(com.vladsch.flexmark.util.ast.Document.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Text.class, this::visit),
            new VisitHandler<>(StrongEmphasis.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Emphasis.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Paragraph.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Link.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Image.class, this::visit),
            new VisitHandler<>(LinkRef.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Reference.class, this::visit),
            new VisitHandler<>(Heading.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.BulletList.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.BulletListItem.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.OrderedList.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.OrderedListItem.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Code.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.CodeBlock.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.BlockQuote.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.ThematicBreak.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.CodeBlock.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.Code.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.IndentedCodeBlock.class, this::visit),
            new VisitHandler<>(com.vladsch.flexmark.ast.FencedCodeBlock.class, this::visit),
            new VisitHandler<>(IndentedCodeBlock.class, this::visit)
                        
    );

    public void visit(com.vladsch.flexmark.util.ast.Document text) {
        System.out.println("Found Document " );
        
        parentsStack.pushAddToParentFct( (Block child)-> rootDoc.getContents().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    public void visit(Heading text) {
        System.out.println("Found Heading " + text.getLevel() + " = " + text.getChars());
        Title title = SimplemarkdownFactory.eINSTANCE.createTitle();
        title.setLevel(text.getLevel());
        
        parentsStack.addChild(title);
        
        parentsStack.pushAddToParentFct( (TextElement child)-> title.getElements().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    public void visit(com.vladsch.flexmark.ast.Paragraph text) {
        System.out.println("Found Paragraph " + " = " + text.getContentChars() );
		Paragraph para1 = SimplemarkdownFactory.eINSTANCE.createParagraph();
		
		// Add this element to its parent
		parentsStack.addChild(para1);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((idm.simplemarkdown.mm.simplemarkdown.TextElement child) -> para1.getElements().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    public void visit(com.vladsch.flexmark.ast.Text text) {
        System.out.println("Found Text " + " = " + text.getChars() );
        
        Text res = SimplemarkdownFactory.eINSTANCE.createText();
//        res.setContent(text.getChars().normalizeEOL());
        res.setText(text.getChars().normalizeEOL());
        
        parentsStack.addChild(res);
  }

    public void visit(StrongEmphasis text) {
        System.out.println("Found StrongEmphasis " + " = " + text.getChars() );
        
        idm.simplemarkdown.mm.simplemarkdown.StrongEmphasis res = SimplemarkdownFactory.eINSTANCE.createStrongEmphasis();
//        res.setText(text.getChars().normalizeEOL());
        
        parentsStack.addChild(res);
        
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getSubtext().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    public void visit(com.vladsch.flexmark.ast.Emphasis text) {
        System.out.println("Found EmphasisEmphasis " + " = " + text.getChars() );
        
        Emphasis res = SimplemarkdownFactory.eINSTANCE.createEmphasis();
//        res.setText(text.getChars().normalizeEOL());
        
        parentsStack.addChild(res);
        
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getSubtext().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();

    }

    public void visit(com.vladsch.flexmark.ast.Link text) {
        System.out.println("Found Link " + " = " + text.getText() + " *** " + text.getUrl() );
        
        Link res = SimplemarkdownFactory.eINSTANCE.createLink();
		if( text.getUrl()!=null)
			  res.setUrl(text.getUrl().normalizeEOL());
			
		if( text.getTitle()!=null)
			  res.setTitle(text.getTitle().normalizeEOL());
			
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getSubtext().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    public void visit(com.vladsch.flexmark.ast.Image text) {
        System.out.println("Found Image " + " = " + text.getText() + " *** " + text.getUrl() );
 
        
        Image res = SimplemarkdownFactory.eINSTANCE.createImage();
		if( text.getUrl()!=null)
			  res.setUrl(text.getUrl().normalizeEOL());
			
		if( text.getTitle()!=null)
			  res.setTitle(text.getTitle().normalizeEOL());
			
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getSubtext().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
   }

    /**
     * 
     * @param text
     */
    public void visit(LinkRef text) {
        System.out.println("Found LinkRef " + " = " + text.getChars() );
        LinkWithRef res = SimplemarkdownFactory.eINSTANCE.createLinkWithRef();
        res.setReference(text.getReference().normalizeEOL());
        
        parentsStack.addChild(res);
        
        // Now, visit childs
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getSubtext().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
    }

    /**
     * 
     * @param text
     */
    public void visit(com.vladsch.flexmark.ast.Reference text) {
        System.out.println("Found Reference " + " = " + text.getChars() );
        Reference res = SimplemarkdownFactory.eINSTANCE.createReference();
		if( text.getReference()!=null)
			  res.setReference(text.getReference().normalizeEOL());
			
		if( text.getUrl()!=null)
			  res.setUrl(text.getUrl().normalizeEOL());
			
		if( text.getTitle()!=null)
			  res.setTitle(text.getTitle().normalizeEOL());
			
        parentsStack.addChild(res);
        
        // No Child
    }

    public void visit( com.vladsch.flexmark.ast.BulletList text) {
        System.out.println("Found BulletList " + " = " + text.getChars().normalizeEOL() );
        BulletList res = SimplemarkdownFactory.eINSTANCE.createBulletList();
        
        parentsStack.addChild(res);
        
        // Now, visit childs
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((BulletListItem child) -> res.getItems().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
    }
   
    public void visit( com.vladsch.flexmark.ast.BulletListItem text) {
        System.out.println("Found BulletListItem " + " = " + text.getChars().normalizeEOL() );
        
        BulletListItem res = SimplemarkdownFactory.eINSTANCE.createBulletListItem();
        parentsStack.addChild(res);
        
        // Now, visit childs
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((ListItemElement child) -> res.getElements().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
     }
   
    public void visit( com.vladsch.flexmark.ast.OrderedList text) {
        System.out.println("Found OrderedList " + " = " + text.getChars() );
        OrderedList res = SimplemarkdownFactory.eINSTANCE.createOrderedList();
        
        parentsStack.addChild(res);
        
        // Now, visit childs
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((idm.simplemarkdown.mm.simplemarkdown.BulletListItem child) -> res.getItems().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
    }
   
    public void visit( com.vladsch.flexmark.ast.OrderedListItem text) {
        System.out.println("Found OrderedListItem " + " = " + text.getChars() );
        
        OrderedListItem res = SimplemarkdownFactory.eINSTANCE.createOrderedListItem();
        parentsStack.addChild(res);
        
        // Now, visit childs
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((ListItemElement child) -> res.getElements().add(child));
		
        visitor.visitChildren(text);
        parentsStack.popParent();
    }
   
    public void visit( com.vladsch.flexmark.ast.Code text) {
        System.out.println("Found Code " + " = " + text.getChars() );
        Code res = SimplemarkdownFactory.eINSTANCE.createCode();
        
        // Get the text and put it in code
        text.getFirstChild();
//		res.setContent(text.getChars().normalizeEOL());
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// 
		List<TextElement> childs = new ArrayList<TextElement>();
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> childs.add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
        
        // Now, get childs
        if( childs.size() >1 || !(childs.get(0) instanceof Text) ) {
//        	throw new ParserException();
        	System.out.println("********* Code as more than one child, or bad type size !!");
        	return;
        }
        Text textchild = (Text)childs.get(0);
        res.setText(textchild.getText());
        childs.clear();
    }
    
    public void visit( com.vladsch.flexmark.ast.CodeBlock text) {
        System.out.println("Found CodeBlock " + " = " + text.getChars() );
        CodeBlock res = SimplemarkdownFactory.eINSTANCE.createCodeBlock();
//		res.setContent(text.getChars().normalizeEOL());
		
        // Add lines
        for(BasedSequence line : text.getSegments()) {
        	CodeLine codeline = SimplemarkdownFactory.eINSTANCE.createCodeLine();
        	codeline.setText(line.normalizeEOL() );
        	res.getCodelines().add(codeline);
        }

        // Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
//		parentsStack.pushAddToParentFct((Block child) -> res.getContents().add(child));
        visitor.visitChildren(text);
//        parentsStack.popParent();
    }
   
    public void visit( IndentedCodeBlock text) {
        System.out.println("Found IndentedCodeBlock " + " = " + text.getChars() );
        CodeBlock res = SimplemarkdownFactory.eINSTANCE.createCodeBlock();
//		res.setContent(text.getChars().normalizeEOL());
        
        // Add lines
        for(BasedSequence line : text.getContentLines()) {
        	CodeLine codeline = SimplemarkdownFactory.eINSTANCE.createCodeLine();
        	codeline.setText(line.normalizeEOL() );
           	res.getCodelines().add(codeline);
        }
 		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
//		parentsStack.pushAddToParentFct((Block child) -> res.getContents().add(child));
//        visitor.visitChildren(text);
//        parentsStack.popParent();
    }
   
    public void visit( FencedCodeBlock text) {
        System.out.println("Found FencedCodeBlock " + " = " + text.getChars() );
        CodeBlock res = SimplemarkdownFactory.eINSTANCE.createCodeBlock();

        // Add lines
        for(BasedSequence line : text.getContentLines()) {
        	CodeLine codeline = SimplemarkdownFactory.eINSTANCE.createCodeLine();
        	codeline.setText(line.unescape());
           	res.getCodelines().add(codeline);
        }
 		

        // Add this element to its parent       
		parentsStack.addChild(res);
		
		// 
//		List<TextElement> childs = new ArrayList<TextElement>();
//		
//		// Push the function that allow to add a child to this element
//		parentsStack.pushAddToParentFct((TextElement child) -> childs.add(child));
//        visitor.visitChildren(text);
//        parentsStack.popParent();
//        
//        // Now, get childs
//        if( childs.size() >1 || !(childs.get(0) instanceof Text) ) {
////        	throw new ParserException();
//        	System.out.println("********* Code as more than one child, or bad type size !!");
//        	return;
//        }
//        // We have one child
//        CodeLine codeline = SimplemarkdownFactory.eINSTANCE.createCodeLine();
//    	codeline.setText( ((Text)childs.get(0)).getText() );
//       	res.getCodelines().add(codeline);
    }
   
    public void visit( com.vladsch.flexmark.ast.BlockQuote text) {
        System.out.println("Found BlockQuote " + " = " + text.getChars() );
        
        BlockQuote res = SimplemarkdownFactory.eINSTANCE.createBlockQuote();
//		res.setContent(text.getChars().normalizeEOL());
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((Block child) -> res.getContents().add(child));
        visitor.visitChildren(text);
        parentsStack.popParent();
    }
   
    public void visit( com.vladsch.flexmark.ast.ThematicBreak text) {
        System.out.println("Found BlockQuote " + " = " + text.getChars() );
        
        HorizontalLine res = SimplemarkdownFactory.eINSTANCE.createHorizontalLine();
		parentsStack.addChild(res);
		
    }
   
    
    /**
     * Options added to the parser.
     * 
     */
    static final DataHolder OPTIONS = new MutableDataSet()
//          .set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create(), StrikethroughExtension.create()))
          .set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create()))
          .toImmutable();

    /**
     * Main method of the class.
     * Parse the specified file, and put the result in the provided {@link Document}.
     * 
     * @param fileReader The input file
     * @param mdDoc The {@link Document} that store the results.
     */
    public void parseFile( FileReader fileReader, Document mdDoc) {
    	
    	// Document parsed by flexmark
    	com.vladsch.flexmark.util.ast.Document document = null;
    	// Init md::Document
    	rootDoc = mdDoc;
    	
    	// Init parsing
        Parser parser = Parser.builder(OPTIONS).build();
        
        // Add table processing
        TableVisitor2Model.addVisitorHandlers(parentsStack, visitor);
        
        
        //document = parser.parse("Example\n=======\n\nSome more text **with highlight**\nend of para. \n# A Tilte\n## 2nd Title\n\n paragraphe \n with lines\n");

        // Parse file
        try {
			document = parser.parseReader( fileReader);
        			} catch (IOException e) {
			e.printStackTrace();
			return;
		}
        
        // Visit AST, and create model
        if(document != null) {
          visitor.visit(document);
        }
        
        System.out.println("Done ..."); 
    }
}
