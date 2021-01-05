/**
 * 
 */
package idm.markdown.parser;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This stack is used to register the current parent. 
 * In fact, it register a method allowing to add a child to the current parent.
 * 
 * The parent should add the method to the stack :
 * 
 * 
 * stack.pushAddToParentFct( (TextElement child)-> title.getElements().add(child));
 * 
 * Then  child ca n add itself to the current parent :
 * stack.addChild(child);
 * 
 * 
 * @author dumoulin
 *
 */
public class Stack {
	
	/**
	 * The function to push on the stack.
	 * @author dumoulin
	 *
	 * @param <T>
	 */
	public interface AddToParent<T> {
		void add(T child);
	}
		

	Deque<Object> stack = new ArrayDeque<Object>();
	
	
	public void popParent() {
		stack.pop();
	}
	

	public <T> void pushAddToParentFct( AddToParent<T> fct ) {
		stack.push(fct);
	}

	public <T> void addChild( T child ) {
		Object top = stack.getFirst();
		
		AddToParent<T> fct = (AddToParent<T>)top;
		fct.add(child);
	}


}
