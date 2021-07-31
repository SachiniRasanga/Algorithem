public class Stack {

	private int top;
	private char []stackArray;
	private int maxSize;
	
	public Stack(int s) {
		
		this.top = -1;
		this.stackArray = new char[maxSize];
		this.maxSize = s;
	}
	
	public boolean isFull() {
		
		return true;
	}
	
	public boolean isEmpty() {
		
		return true;
	}
	public void push(char j) {
		
		if(top==(maxSize-1)) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top]=j;
		}
		
	}
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			return stackArray[top--];
		}
	}
	public char peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			return stackArray[top];
		}
	}
}
/*package StackX;

public class MainStack {

	public static void main(String[] args) {
		
		StackX mystack=new StackX(10);
		
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		
		
		while(!mystack.isEmpty()) {
			
			System.out.println(mystack.pop());
		}
		
		

	}

}
*/
