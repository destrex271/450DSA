
import java.io.*;
import java.util.*;


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
		Node n = new Node();
		Node nd = getNodeAtPos(head, pos);
		nd.next = nd.next.next; // Changing the next node to the prev node to be the node next to the one to be deleted
		// This successfully removes the node from the linked list but the Node still exists in memory
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

			System.out.println("Enter :\n  1. Append Node\n  2. Insert Node\n  3. Delete Node\n  69. Exit");
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
				case 69:
				default:
					System.out.println("Exiting"); // Quiting the infinite switch case
					System.exit(0);
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