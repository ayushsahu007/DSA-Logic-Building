package SinglyLinkedList;


public class DeleteByIndex {
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (tail == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

    public void deleteByIndex(int idx) {
            Node temp = head;
            for (int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size-1) tail = temp;
            size--;
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
       ll.deleteByIndex(2);
        ll.display();
    }
}
