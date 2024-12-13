public class LinkedList{
	private Node head;
	private Node tail;
	int size;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
		}
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}		
	}	
	public void insertFirst(int data){
		Node n=new Node(data);
		n.next=head;
		head=n;
		if(tail==null){
			tail=head;
		}
		size++;
	}
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}