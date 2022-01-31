package singlyLinked;

import java.io.*;


class Node{
	int data;// data stored by the node
	Node next;// Pointer to the next node
}

public class Linked{

	static BufferedReader bfr;  // Input stream Reader Object
	public static Node lastNode = null; // Last Node 

	static Node getNodeAtPos(Node head, int pos){
		Node nd = head; // Track Node to reach the node before the designated position
		for(int i = 1; i<pos;i++){
			nd = nd.next;
		}
		return nd;
	}

	static void appendNode()throws IOException{
		Node n = new Node(); // Initializing a new node
		n.data = Integer.valueOf(bfr.readLine()); // Getting the value to store in that node
		n.next = null; // Since we are appending this node to the end of the linked list we make the next element pointer to be null
		lastNode.next = n; // appending this orphan node to the rest of the linked list
		lastNode = n; // Updating the last Node element to this element
	}

	static Node searchNode(Node head, int x){
		Node n = head;
		while(n != null){ // Checks for end of linked list
			if(n.data == x) return n; // Returns node if element is found
			n = n.next;
		}
		return null; // Returns null if element is not found
	} 

	static void insertNode(Node head, int pos)throws IOException{
		Node n = new Node(); // Initializing the new Node
		System.out.println("Enter the value to store in the new Node");
		n.data = Integer.valueOf(bfr.readLine()); // Getting the value to store in this new node
		Node nd = getNodeAtPos(head, pos);
		Node y = nd.next; // Temporarily storing the node that was originally supposed to be at the given pos
		nd.next = n; // Inserting our new node at the given position
		n.next = y; // Setting the original element as the node next to our node in the linked list
	}

	static void deleteNode(Node head, int pos)throws IOException{
		Node nd = getNodeAtPos(head, pos);
		nd.next = nd.next.next; // Changing the next node to the prev node to be the node next to the one to be deleted
		// This successfully removes the node from the linked list but the Node still exists in memory
	}

	static void updateNode(Node head, int pos, int val)throws IOException{
		Node nd = getNodeAtPos(head, pos+1); // Getting the node
		nd.data = val; // Changing node value
	}

	static void sortNodes(Node head)throws IOException{
		Node i = head; // Grabbing first node
		while(i.next != null){
			Node j = i.next;
			while(j != null){
				if(i.data > j.data){ // Implementing selection sort
					int s = i.data;
					i.data = j.data;
					j.data = s;
				}
				j = j.next;
			}
			i = i.next;
		}
	}

	public static void main(String args[])throws IOException{

		bfr = new BufferedReader(new InputStreamReader(System.in)); // Initializing the buffered reader to read from the system input stream

		System.out.println("Enter the value of head node");
		Node head = new Node(); // Initializing the head node of the linked list
		head.data = Integer.valueOf(bfr.readLine()); // Assigning data to the head node

		System.out.println("Enter the value of N1 node");
		Node n1 = new Node(); // Initializing the next Node in the linked list
		head.next = n1; // Appending the node to the linked list
		n1.data = Integer.valueOf(bfr.readLine()); // Add data to node

		System.out.println("Enter the value of N2 node");
		Node n2 = new Node(); // Initializing another node
		n1.next = n2; // Appending the 2nd node to the 1st one
		n2.data = Integer.valueOf(bfr.readLine()); // Reading the data into the node

		n2.next = null; // Since n2 is the last node in the linked list for now we initialize its next element pointer to null

		lastNode = n2; // Updating the last node element to n2

		while(true){ // Menu driven switch case to append, insert, remove and display the elements of our linked list

			System.out.println("Enter :\n  1. Append Node\n  2. Insert Node\n  3. Delete Node\n  4. Search For Node\n  5. Update Node\n  6. Sort Linked List\n  69. Exit");
			int ch = Integer.valueOf(bfr.readLine());
			int pos;
			switch(ch){
				case 1:
					appendNode(); // Called to add a new node to the linked list
					System.out.println("\n-----------------------------------------------------------------");
					displayLinkedList(head);
					System.out.println("\n-----------------------------------------------------------------");
					break; // append case finished
				case 2:
					System.out.println("Enter the position to insert element into");
					pos = Integer.valueOf(bfr.readLine()); // Getting the position to insert the node to
					insertNode(head, pos); // Called to insert a node at position from the linked list
					System.out.println("\n-----------------------------------------------------------------");
					displayLinkedList(head);
					System.out.println("\n-----------------------------------------------------------------");
					break; // insert case finished
				case 3:
					System.out.println("Enter the position to remove element from the linked list");
					pos = Integer.valueOf(bfr.readLine()); // Getting the position to remove node from
					deleteNode(head, pos); // Called to delete the node
					System.out.println("\n-----------------------------------------------------------------");
					displayLinkedList(head);
					System.out.println("\n-----------------------------------------------------------------");
					break; // delete case finished
				case 4:
					System.out.println("Enter the element to search for in the linked list");
					int elem = Integer.valueOf(bfr.readLine()); // Getting the element to search for
					if(searchNode(head, elem) != null) System.out.printf("Element %d was FOUND in the linked list.",elem); // Searching for element
					else System.out.printf("Element %d was NOT FOUND in the linked list.", elem); // And displaying appropriate messages
					break;
				case 5:
				    System.out.println("Enter the position of the node to update");
					pos = Integer.valueOf(bfr.readLine()); // Getting position of node to update
					System.out.println("Enter the new value of the node");
					int val = Integer.valueOf(bfr.readLine()); // Getting new value
					updateNode(head, pos, val); // updating node
					System.out.println("\n-----------------------------------------------------------------");
					displayLinkedList(head);
					System.out.println("\n-----------------------------------------------------------------");
					break;
				case 6: 
					sortNodes(head); // Sort linked list
					System.out.println("\n-----------------------------------------------------------------");
					displayLinkedList(head); // Displaying sorted linked list
					System.out.println("\n-----------------------------------------------------------------");
					break;
				case 69:
				default:
					System.out.println("Exiting"); // Quiting the infinite switch case
					System.exit(0); // Exiting the program
			}
		}

	}

	static void displayLinkedList(Node head){
		Node nd = head;
		while(nd != null){
			System.out.println(nd.data);
			nd = nd.next;
		}
	}

}