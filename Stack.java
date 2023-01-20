package dataStructure;

public class Stack {
	
	

	
	
	static StackNode head;
	
	static class StackNode{
		
		int data;
		StackNode next;
		
		StackNode(int d){
			data=d;
		    next=null;
		}
		
	}
	
	
	static void push(int data) {
		
		StackNode newNode=new StackNode(data);
		
		newNode.next=head;
		head=newNode;
		
	}
	
	static void pop() {
		head=head.next;
	}
	
	static void print() {
		
		StackNode pnode=head;
		
		while(pnode!=null) {
			System.out.println(pnode.data);
			pnode=pnode.next;
		}
	}
	
	static void top() {
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
	
		push(3);
		push(2);
		push(1);
		top();
		pop();
		top();
		System.out.println("-------");
		print();
	
		
		
	
	}

}
