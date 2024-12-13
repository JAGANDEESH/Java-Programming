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
	public void insertLast(int data){
		
		if(tail==null){
			insertFirst(data);
					size++;
			return;
		}
		Node n=new Node(data);
		tail.next=n;
		tail=n;
				size++;
		
	}
	public void deleteAtIndex(int index){
		
		if(index==0){
			head=head.next;
			size--;
			return;
		}
		if(index==size){
			tail=null;
			size--;
			return;
			
		}
		Node temp=head;
		for(int i=1;i<index;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
		
	}
	public void insert(int data,int index){
		
		if(index==0){
			insertFirst(data);
			size++;
			return;
		}
		if(index==size){
			insertLast(data);
			size++;
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++){
			temp=temp.next;
		}
		Node n=new Node(data,temp.next);
		temp.next=n;
		size++;
	}
	public int len(){
		return size;
	}
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
}