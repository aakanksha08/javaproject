package LL;

public class LinkedListMergeSort {
	Node head;


	private Node mergeSort(Node head) {
		// TODO Auto-generated method stub
		if(head  == null )
			return null;
		if(head.next == null)
			return head;
		Node mid = mid_Node(head);
		Node head2 = mid.next;
		mid.next = null;
		//	System.out.println(mid.data);
		head = mergeSort(head);

		head2 = mergeSort(head2);

		return  mergeSortedList(head,head2);

	}

	private Node  mergeSortedList(Node head1, Node head2) {

		Node headptr = new Node(0);
		Node temp = headptr;

		while(head1 != null || head2!= null) {

			if(head1 == null) {
				temp.next = head2;
				break;
			}
			if(head2 == null) {
				temp.next = head1;
				break;
			}
			
			if(head1.data <= head2.data) {

				temp.next = head1;
				head1 = head1.next;

			}
			else {

				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
			
			

		}

		
		return headptr;
	}

	public static Node mid_Node(Node head){
		if (head == null)
			return null;

		Node slow_ptr = head;
		Node fast_ptr = head.next;

		while( fast_ptr!= null && fast_ptr.next!=null) {
			slow_ptr = slow_ptr.next;	
			fast_ptr = fast_ptr.next.next;		 
		}
		return slow_ptr;
	}
	public void push(int new_data) 
	{ 


		Node new_Node = new Node(new_data); 


		new_Node.next = head; 


		head = new_Node; 
	} 


	public void printList(Node n) {
		while(n!=null) {
			System.out.print(n.data+ "--> ");
			n= n.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListMergeSort li = new LinkedListMergeSort(); 
		/* 
		 * Let us create a unsorted linked lists to test the functions Created 
		 * lists shall be a: 2->3->20->5->10->15 
		 */
		li.push(15); 
		li.push(10); 
		li.push(5); 
		li.push(20); 
		li.push(3); 
		li.push(2); 
		System.out.println("Linked List without sorting is :"); 
		li.printList(li.head); 

		// Apply merge Sort 
		li.head = li.mergeSort(li.head); 
		System.out.print("\n Sorted Linked List is: \n"); 
		li.printList(li.head); 
	}


}
