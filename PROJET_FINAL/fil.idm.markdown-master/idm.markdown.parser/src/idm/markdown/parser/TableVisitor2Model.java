/**
 * 
 */
package idm.markdown.parser;

import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

import idm.simplemarkdown.mm.simplemarkdown.SimplemarkdownFactory;
import idm.simplemarkdown.mm.simplemarkdown.TableBlock;
import idm.simplemarkdown.mm.simplemarkdown.TableBody;
import idm.simplemarkdown.mm.simplemarkdown.TableCell;
import idm.simplemarkdown.mm.simplemarkdown.TableCellAlignement;
import idm.simplemarkdown.mm.simplemarkdown.TableHead;
import idm.simplemarkdown.mm.simplemarkdown.TableRow;
import idm.simplemarkdown.mm.simplemarkdown.TableSection;
import idm.simplemarkdown.mm.simplemarkdown.TableSeparator;
import idm.simplemarkdown.mm.simplemarkdown.TextElement;

/**
 * Add Table capabilities.
 * This class provides visitor handlers used to create Table elements.
 * 
 * @author dumoulin
 *
 */
public class TableVisitor2Model {

	
	/**
	 * Stack to track the current parent element.
	 * Stack is provided when the class is created.
	 */
	protected Stack parentsStack;
	

	protected NodeVisitor visitor;
	
	// example of visitor for a node or nodes, just add VisitHandlers<> to the list
	// any node type not handled by the visitor will default to visiting its children
	VisitHandler<?> handlers[] = {
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableBlock.class, this::visit),
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableHead.class, this::visit),
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableSeparator.class, this::visit),
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableBody.class, this::visit),
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableRow.class, this::visit),
			new VisitHandler<>(com.vladsch.flexmark.ext.tables.TableCell.class, this::visit),

	};
	
	
	/**
	 * Method use to hook this class to the parsing process.
	 * @param stack
	 * @param originalVisitor
	 */
	public static void addVisitorHandlers(Stack stack, NodeVisitor originalVisitor) {
		// We just create an instnace. This will initialize the handlers and add them to the 
		// visitor.
		new TableVisitor2Model(stack, originalVisitor);
	}

	/**
	 * Constructor.
	 * 
	 * Create an instance of this class.
	 * Set the Stack to use, and fill the provided visitor.
	 * 
	 * @param stack
	 * @param originalVisitor
	 */
	private TableVisitor2Model( Stack stack, NodeVisitor originalVisitor ) {
		// Store the stack
		parentsStack = stack;
		// Add new handlers
		originalVisitor.addHandlers(handlers);
		// Store the visitor, so that handlers can call registered handler
		this.visitor = originalVisitor;
	}
 
	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableBlock node) {
        System.out.println("Found TableBlock " + " = " + node.getContentChars() );
        TableBlock res = SimplemarkdownFactory.eINSTANCE.createTableBlock();
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TableSection child) -> res.getSections().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }

	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableSeparator node) {
        System.out.println("Found TableSeparator " + " = " + node.getNodeName() );
        TableSeparator res = SimplemarkdownFactory.eINSTANCE.createTableSeparator();
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TableRow child) -> res.getRows().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }

	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableHead node) {
        System.out.println("Found TableHead " + " = " + node.getNodeName() );
        TableHead res = SimplemarkdownFactory.eINSTANCE.createTableHead();
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TableRow child) -> res.getRows().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }

	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableBody node) {
        System.out.println("Found TableBody " + " = " + node.getNodeName() );
        TableBody res = SimplemarkdownFactory.eINSTANCE.createTableBody();
		
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TableRow child) -> res.getRows().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }

	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableRow node) {
        System.out.println("Found TableBody " + " = " + node.getNodeName() );
        TableRow res = SimplemarkdownFactory.eINSTANCE.createTableRow();
		
        res.setRowNumber(node.getRowNumber());
        
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TableCell child) -> res.getCells().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }

	/**
	 * 
	 * @param text
	 */
    public void visit(com.vladsch.flexmark.ext.tables.TableCell node) {
        System.out.println("Found TableCell " + " = " + node.getAlignment() );
        TableCell res = SimplemarkdownFactory.eINSTANCE.createTableCell();
		
        // Set the alignment
        
        if( node.getAlignment() != null ) {
          res.setAlignement( TableCellAlignement.get(node.getAlignment().name())  );
        }
        res.setIsHeader(node.isHeader() );
        res.setSpan(node.getSpan());
        
        
		// Add this element to its parent
		parentsStack.addChild(res);
		
		// Push the function that allow to add a child to this element
		parentsStack.pushAddToParentFct((TextElement child) -> res.getElements().add(child));
        visitor.visitChildren(node);
        parentsStack.popParent();
    }


}
