package idm.markdown.parser.examples;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

@SuppressWarnings({ "unchecked", "WeakerAccess" })
public class VisitorSample2 {
    int wordCount;

    // example of visitor for a node or nodes, just add VisitHandlers<> to the list
    // any node type not handled by the visitor will default to visiting its children
    NodeVisitor visitor = new NodeVisitor(
            new VisitHandler<>(Text.class, this::visit)
    );

    public void visit(Text text) {
        // This is called for all Text nodes. Override other visit handlers for other node types.
        wordCount += text.getChars().unescape().split("\\W+").length;

        // Descending into children
        visitor.visitChildren(text);

        // Count words (this is just an example, don't actually do it this way for various reasons).
    }

    void countWords() {
        Parser parser = Parser.builder().build();
        Node document = parser.parse("Example\n=======\n\nSome more text\n# A Tilte\n## 2nd Title\n\n paragraphe \n with lines\n");
        visitor.visit(document);

        System.out.println(wordCount);  // 4
    }
    
    
    public static void main(String[] args) {
        VisitorSample2 visitorSample = new VisitorSample2();
        visitorSample.countWords();
        
        // Build output model
    }
    
//    protected static Model createModel(String name) {
//        Model model = UMLFactory.eINSTANCE.createModel();
//        model.setName(name);
//
//        out("Model '%s' created.", model.getQualifiedName());
//
//        return model;
//    }

}