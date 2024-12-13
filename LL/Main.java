public class Main{
	public static void main(String args[]){
		LinkedList ll=new LinkedList();
		ll.insertLast(10);
		ll.insertLast(20);
		ll.insertLast(30);
		ll.insertLast(40);
		ll.insertLast(1);
		ll.insert(3,4);
		ll.print();
		
		System.out.println(ll.len());
		ll.deleteAtIndex(ll.len()-2);
		
		ll.print();
		System.out.println(ll.len());
	}
}