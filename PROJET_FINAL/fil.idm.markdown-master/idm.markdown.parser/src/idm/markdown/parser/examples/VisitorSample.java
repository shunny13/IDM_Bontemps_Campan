package idm.markdown.parser.examples;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.LinkRef;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

@SuppressWarnings({ "unchecked", "WeakerAccess" })
public class VisitorSample {
    int wordCount;

    // example of visitor for a node or nodes, just add VisitHandlers<> to the list
    // any node type not handled by the visitor will default to visiting its children
    NodeVisitor visitor = new NodeVisitor(
            new VisitHandler<>(Text.class, this::visit),
            new VisitHandler<>(StrongEmphasis.class, this::visit),
            new VisitHandler<>(Paragraph.class, this::visit),
            new VisitHandler<>(Link.class, this::visit),
            new VisitHandler<>(Image.class, this::visit),
            new VisitHandler<>(LinkRef.class, this::visit),
            new VisitHandler<>(Heading.class, this::visit)
    );

    public void visit(Text text) {
//        System.out.println("Found Text " + " = " + text.getBaseSequence());
        // This is called for all Text nodes. Override other visit handlers for other node types.
        wordCount += text.getChars().unescape().split("\\W+").length;

        // Descending into children
        //visitor.visitChildren(text);

        // Count words (this is just an example, don't actually do it this way for various reasons).
    }

    public void visit(Heading text) {
        System.out.println("Found Heading " + text.getLevel() + " = " + text.getChars());
    }

    public void visit(Paragraph text) {
        System.out.println("Found Paragraph " + " = " + text.getContentChars() );
        visitor.visitChildren(text);
    }

    public void visit(StrongEmphasis text) {
        System.out.println("Found StrongEmphasis " + " = " + text.getChars() );
    }

    public void visit(Link text) {
        System.out.println("Found Link " + " = " + text.getText() + " *** " + text.getUrl() );
        visitor.visitChildren(text);
    }

    public void visit(Image text) {
        System.out.println("Found Image " + " = " + text.getText() + " *** " + text.getUrl() );
 
    }

    public void visit(LinkRef text) {
        System.out.println("Found LinkRef " + " = " + text.getChars() );
    }

    
    void countWords() {
        Parser parser = Parser.builder().build();
        Document document = null;
        //document = parser.parse("Example\n=======\n\nSome more text **with highlight**\nend of para. \n# A Tilte\n## 2nd Title\n\n paragraphe \n with lines\n");

        try {
        	String filename = "src/resources/md/installPapyrus.md";
        	
//        	URL url = ClassLoader.getSystemResource(filename);
//        	InputStream s = this.getClass().getResourceAsStream(filename)
        	
			document = parser.parseReader( new FileReader(new File(filename)));
        	
        	// Ca aussi ca marche:
//        	String content = new String(Files.readAllBytes(Paths.get(filename)));
//        	document = parser.parse( content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(document != null) {
          visitor.visit(document);

        }
        
        System.out.println(wordCount);  // 4
    }
    
    
    public static void main(String[] args) {
        VisitorSample visitorSample = new VisitorSample();
        visitorSample.countWords();
    }
}