package dataStructures;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = new Node(value);
            return;
        }
        newNode.next = null;
        Node lastNode = head;
        while (lastNode.next != null) {
            System.out.print(lastNode.data + "-->");
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Search a node
    public boolean search(Node head, int key) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Insert after a node
    public void insertAfter(Node prevNode, int value) {
        if (prevNode == null) {
            System.out.println("Given Previous Node cannot be null");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node current = head;

        if (position == 0) {
            head = current.next;
            return;
        }

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Element not found");
            return;
        }

        //remove the node
        Node next = current.next.next;
        current.next = next;

    }

    // Print the linked list
    public void printLinkedList() {
        Node lastNode = head;
        while (lastNode.next != null) {
            System.out.print(lastNode.data + "-->");
            lastNode = lastNode.next;
        }
        System.out.println(lastNode.data);
    }

    public void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data =index.data;
                    index.data =temp;
                }
                index = index.next;
            }
            current =current.next;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(6);
        linkedList.insertAtEnd(0);
        linkedList.insertAtBeginning(3);
        System.out.println("Linked List:");
        linkedList.printLinkedList();
        linkedList.deleteNode(1);
        System.out.println("Linked List after delete:");
        linkedList.printLinkedList();
        linkedList.sortLinkedList(linkedList.head);
        System.out.println("Linked List after buble sort:");
        linkedList.printLinkedList();


        System.out.println("Does linkedList has 5: " + linkedList.search(linkedList.head, 5));

    }
}
