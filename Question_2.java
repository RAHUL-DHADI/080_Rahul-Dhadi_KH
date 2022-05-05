import java.util.*;
class ListReverse{
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	Node insertAtFirst(int x){
		Node newNode = new Node(x);
		// if(head==null){
			// head=newNode;
		// }
		//else{
		newNode.next=head;
		head=newNode;
		
		
		//}
		return head;
	}
	
	
	Node insertAtLast(int x){
		Node newNode = new Node(x);
		Node n=head;
		if(head==null){
			head=newNode;
		}
		else{
		while(n.next != null){
			n=n.next;
		}
		n.next=newNode;
		newNode.next=null;
		}
		return head;
	}
	
	void  createList(){
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=Sc.nextInt();
		int f=Sc.nextInt();
		head=insertAtFirst(f);
		for(int i=2;i<=n;i++){
			int f2=Sc.nextInt();
			head=insertAtLast(f2);
			
		}		
		
	}
	
	Node reverse(Node head){
		Node next;
		Node temp=head;
		Node prev=null;
		while(temp !=null){
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
			
		}
		head=prev;
		return head;
	}
		
		
	
	void display(){
		Node n=head;
		while(n != null){
			System.out.println(n.data);
		}
	}
	
	
	public static void main(String args[]){
		
		ListReverse L1=new ListReverse();
	    L1.createList();
		
		L1.display();
		//
		L1.reverse(L1.head);
		L1.display();
		
		
		
		
}
}