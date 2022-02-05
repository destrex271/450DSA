package DoublyLinked;

import java.io.*;

class Node{
    public int data;
    Node prev, next;

    Node(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}


public class DoublyLinked {
    public static BufferedReader bfr;

    static void displayForwardTraversal(Node head){
        Node nd = head;
        while(nd != null){
            System.out.println(nd.data);
            nd = nd.next;
        }
        System.out.println("-------------------------------------");
    }

    static void displayBackwardsTraversal(Node lastNode){
        Node nd = lastNode;
        while(nd != null){
            System.out.println(nd.data);
            nd = lastNode.prev;
        }
        System.out.println("--------------------------------------");
    }

    static Node getAtPos(int pos, Node head){
        Node nd = head;
        for(int i = 1; i < pos; i++){
            nd = nd.next; // Targeting next node
        }
        return nd;
    }

    static void insertAtPos(int pos, Node head)throws IOException{
        // Insert Node at position
        int val = Integer.valueOf(bfr.readLine());
        Node prevNode = getAtPos(pos, head);
        Node xNode = prevNode.next;
        Node nd = new Node(val, prevNode, xNode);
        prevNode.next = nd;
        xNode.prev = nd;
    }

    static Node updateLastNode(Node head){
        Node nd = head;
        while(true){
            if(nd.next == null){
                return nd;
            }
            nd = nd.next;
        }
    }

    static Node searchNodeByValue(int val, Node head){
        Node nv = head;
        while(nv != null){
            if(nv.data == val){
                return nv;
            }
            nv = nv.next;
        }
        return null;
    }

    static void deleteNode(int pos, Node head){
        Node n = getAtPos(pos+1, head);
        Node pNode = n.prev;
        Node xNode = n.next;
        pNode.next = xNode;
        xNode.prev = pNode;
        n.prev = null;
        n.next = null;
    }

    public static void main(String args[])throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in)); // Input Reader Object
        System.out.println("Enter the value of head node"); // Taking in the value for the head node
        Node head = new Node(Integer.valueOf(bfr.readLine()), null, null);
        Node lastNode = head;
        while(true){
            int ch = Integer.valueOf(bfr.readLine());
            System.out.println("Enter:\n  1. Append a Node\n  2. Insert Node at position\n  3. Forward Traversal\n 3.  Backwards Traversal\n  Any Other Key to exit out of the program.")
            int val;
            switch(ch){
                case 1:
                    // Appending Node
                    val = Integer.valueOf(bfr.readLine());
                    Node nv = new Node(val, head, null); // New node to append at end
                    head.next = nv;
                    lastNode = updateLastNode(head);
                    break;
                case 2:
                    // Insert Node at position
                    int pos = Integer.valueOf(bfr.readLine());
                    insertAtPos(pos, head); // Inserting Node
                    lastNode = updateLastNode(head);
                    break;
                case 3:
                    // Display forward traversal
                    displayForwardTraversal(head);
                    break;
                case 4:
                    // Display backwards traversal
                    displayBackwardsTraversal(lastNode);
                    break;
                case 5:
                    // Search Node
                    val = Integer.valueOf(bfr.readLine());
                    Node res = searchNodeByValue(val, head);
                    break;
                case 6:
                    // Delete Node
                    val = Integer.valueOf(bfr.readLine()); // Position
                    deleteNode(val, head);
                    break;
                default:
                    System.exit(0);
            }
        }

    }

}
