package SinglyLinkedList;


public class DeleteAtHead {
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (tail == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

    public void deleteAtHead(){
        if (head == null){
            System.out.println("LL is Already Empty");
            return;
        }
        head = head.next;
        if (head == null){
            tail = null;
        }
    }

        public void display() {
            if (head == null) return;
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }

        }

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.deleteAtHead();
        ll.display();
    }
}
