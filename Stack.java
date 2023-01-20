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
	static boolean isEmpty() {
		if(head==null) {
	           return true;}
		
		return false;
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
	
	
	static int size() {
                StackNode pnode=head;
                int i=0;		
		while(pnode!=null) {
			i++;
			pnode=pnode.next;
		}
		return i;
	}
	
	static void top() {
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
	
		 System.out.println(isEmpty());
		push(3);
		System.out.println(isEmpty());
		push(2);
		push(1);
		System.out.println("size: "+size());
		pop();
		top();
		System.out.println("-------");
		print();
		
		
	
	}

}
