package DSA.LinkedList;

public class CircularL {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.addPosition(5,2);
        list.deleteValue(5);
        list.display();
    }    









    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static class CircularList{
        Node head;
        Node tail;
        int size;

        public CircularList(){
            this.size=0;
        }

        public void insert(int data){
            Node node = new Node(data);
            if(head == null){
                head = node;
                tail =node;
                size++;
                return;
            }
            tail.next = node;
            tail = node;
            node.next = head;
            size++;
        }

        

        public void addPosition(int data , int pos){
            Node node = new Node(data);
            int position =0;
            Node temp = head;

            while(position < pos){
                if(position == pos-1){
                    Node temp2 = temp.next;
                    temp.next = node;
                    node.next = temp2;
                    size++;
                    break;
                }
                temp =temp.next;
                position++;
            }
            
        }

        public void deletePos(int pos){
            Node temp = head;
            int position =0;
            while (temp.next!=null) {
                if (position + 1 == pos) {
                temp.next = temp.next.next;
                size--; // ✅ delete node
                break;
            }
                temp = temp.next;
                position++;

            }
        }

        public void deleteValue(int value){
            Node temp = head;
            if(temp.data == value){
                head = temp.next;  
                return;
            }
            while (temp.next!=null) {
                if (temp.next.data == value) {
                temp.next = temp.next.next; // ✅ delete node
                break;
            }
                temp = temp.next;
                

            }
        }

        public void display(){
            Node temp =head;
            if(head != null){
                while(temp.next != head){
                System.out.println(temp.data +" " + temp.next);
                temp = temp.next;
            }
            System.out.println(temp.data);
            }
        }

}
}