package linkedList;

class Node {
	int data;
	Node next;
	
	Node(int x){
		this.data = x;
		this.next = null;
	}
}
public class singleLinkedList {

	public static void main(String[] args) {
		Node head = new Node(26);
		Node block1 = new Node(20);
		Node block2 = new Node(30);
		Node block3 = new Node(40);
		
		head.next = block1;
		block1.next = block2;
		block2.next = block3;
		

		printLinkedList(head);
		head = insertAtFront(head,52);
		head = insertAtEnd(head, 68);
		head = insertAtSpecificLocation(head, 40, 95);
		printLinkedList(head);
		System.out.print(searchLinkedList(head, 52));
	}

	private static Node insertAtSpecificLocation(Node head, int key, int i) {
		Node newNode = new Node(i);
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		Node curr = head;
		while(curr != null && curr.data!=key) {
			curr=curr.next;
		}
		if(curr==null) {
			System.out.println("Key not found!");
			return head;
		}else {
			Node temp = curr.next;
			System.out.println(curr.data+ " " +temp.data);
			curr.next = newNode;
			newNode.next = temp;
			return head;
		}
	}

	private static Node insertAtEnd(Node head, int i) {
		Node newNode = new Node(i);
		if(head == null)
			return newNode;
		
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return head;
	}

	private static Node insertAtFront(Node head, int i) {
		Node newNode = new Node(i);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

	private static boolean searchLinkedList(Node head, int i) {
		boolean isPresent = false;
		while(head!=null) {
			if(head.data == i) {
				isPresent = true;
				break;
			}
			head = head.next;
		}
		return isPresent;
	}

	private static void printLinkedList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

}
