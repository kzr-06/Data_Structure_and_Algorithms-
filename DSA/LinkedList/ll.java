package DSA.LinkedList;

public class ll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.addPosition(99,1);
        list.deleteValue(4);

        list.display();

    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        public Node (int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static class LinkedList{
        Node head;
        int size;

        public LinkedList(){
            this.size=0;
        }

        public void addFirst(int data){
            Node node = new Node(data);
            node.next = head;
            head = node;
            size++;
        }

        public void addLast(int data){
            Node node = new Node(data);
            Node temp = head;
            while(temp.next!=null){
                System.out.println(temp +" " + temp.data +" " +temp.next);
                temp = temp.next;
            }
            temp.next = node;
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
                temp.next = temp.next.next; // ✅ delete node
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
            while(temp!=null){
                System.out.println(temp.data +" " + temp.next);
                temp = temp.next;
            }
        }

    }
}

