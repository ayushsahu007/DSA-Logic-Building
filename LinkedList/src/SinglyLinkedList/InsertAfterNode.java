package SinglyLinkedList;


public class InsertAfterNode {
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
        public void insertAt(int target, int val) {
            Node t = new Node(val);
            Node temp = head;
            // Insert After a Node
            while (temp.val!= target && temp != null)  {
                temp = temp.next;
         }
            t.next = temp.next;
            temp.next = t;

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
        ll.insertAt(20,50);
        ll.display();


    }
}
