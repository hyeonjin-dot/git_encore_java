import java.util.Stack;

import com.encore.data.structor.stack.EncoreStack;

public class StackDemoMain {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.add(40);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);*/
		
		/*Stack<String> stack = new Stack<>();
		System.out.println(stack.empty());
		if (stack.isEmpty()) {
			stack.push("one");
			stack.push("two");
			stack.push("three");
		}
		stack.add(0, "four");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println("search : " + stack.search("one"));*/
		
		EncoreStack stack = new EncoreStack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.peek());
		System.out.println();
		stack.prtStack();
		System.out.println();
		stack.prtStack2();
		System.out.println(stack.size());
		
	}

}
