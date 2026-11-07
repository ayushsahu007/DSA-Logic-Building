package SinglyLinkedList;


public class InsertAt {
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
        public void insertAt(int idx, int val) {

            if (idx<0 || idx>size){
                System.out.println("Invalid Index ");
                return;
            }

            Node t = new Node(val);


            // Insert at beginning
            if (idx == 0) {
                t.next = head;
                head = t;

                if (tail == null) {
                    tail = t;
                }
            }
            // Insert at end
            else if (idx == size) {
                tail.next = t;
                tail = t;
            }


            // Insert in middle
            else {
                Node temp = head;

                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
            size++;
        }

        public void display() {
           if (head == null) return;
           Node temp = head;
           while (temp != null){
               System.out.print(temp.val+" ");
               temp = temp.next;
           }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
        ll.insertAt(1,50);
        ll.display();


    }
}
