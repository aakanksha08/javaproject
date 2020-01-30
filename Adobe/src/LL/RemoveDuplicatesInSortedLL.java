package LL;

public class RemoveDuplicatesInSortedLL {
	Node head;
	
	private Node remove_duplicates(Node head) {
		
		if( head == null)
				return null;
		
		Node temp = head;
		
		while(temp != null && temp.next != null) {
			Node curr = temp;
			
			while(curr != null && curr.next!= null && curr.next.data == curr.data) {
				curr = curr.next;
			}
			
			temp.next = curr.next;
			temp = temp.next;
		}
		
		return head;
		
		
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

		RemoveDuplicatesInSortedLL li = new RemoveDuplicatesInSortedLL(); 
		/* 
		 * Let us create a sorted linked lists in increasing order
		 */
		
		li.push(45); 
		li.push(45);  
		li.push(35); 
		li.push(33); 
		li.push(33); 
		li.push(30);
		li.push(20); 
		li.push(20); 
		li.push(20);
		
		
		System.out.println("Linked List with duplicates is :"); 
		li.printList(li.head); 
		
		//removing duplicates
		Node n = li.remove_duplicates(li.head);
		System.out.println("Linked List after removing duplicates is :"); 
		li.printList(n);
	}

}
