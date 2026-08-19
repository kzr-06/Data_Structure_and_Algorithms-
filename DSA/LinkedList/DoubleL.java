package DSA.LinkedList;

public class DoubleL {
    public static void main(String[] args) {
        Double list = new Double();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(18);
        // list.display();
        System.out.println();
        list.insert(1);
        list.display();

    }



    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

   public static class Double{
    Node head;
    int size;

    public Double(){
        this.size = 0;
    }

     public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        node.data=data;
        if(head!=null){
            head.prev = node;
        }
        size++;
        head = node;  
    }
    
    public void display(){
        Node temp  = head;
        while (temp!=null) {
            System.out.println(temp.prev+" "+temp.data+" " + temp.next);
            temp = temp.next;
        }
    }
    
    public void displayRev(){
        Node temp  = head;
        Node last = null;
        while (temp!=null) {
            last=temp;
            temp = temp.next;
        }
        while (last!=null) {
            System.out.println(last.data);
            last = last.prev;
        }
    }

    public void insert(int data,int pos){
        int position = 0;
        Node temp = head;
        Node node = new Node(data);

        if(pos > size+1){
            System.out.println("Index out of range");
            return;
        }

        while(temp!=null){
            if(pos-1==position){
                if(position < size-1){
                    System.out.println(temp.data);
                    Node temp2 = temp.next;
                    temp.next = node;
                    node.prev = temp;
                    node.next = temp2;
                    temp2.prev = node;
                }else{
                    temp.next = node;
                    node.prev = temp;
                }
                size++;
                break;
            }
            position++;
            temp = temp.next;
        }

    }
   
    
    public void insert(int data){
        Node temp = head;
        Node node = new Node(data);

        if(head == null){
            head = node;
            size++;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = node;
        node.prev = temp;
        size++;
    }
}
}
