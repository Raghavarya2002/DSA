public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    LinkedList(){
        this.size = 0;
    }
    


    public class Node{

       private int value;
       private Node Next;
       public Node(int value){
           this.value = value;
       }
       public Node(int value, Node Next){
           this.value = value;
           this.Next = Next;
       }


    }
    
    public void Insertfirst(int val){
        Node n1 = new Node(val);
        n1.Next = head;
        head = n1;
        if(tail == null){
            tail = head;
        }

        size = size + 1;


    }

    public void Insertlast(int val){
        
        
        if(tail == null){
           Insertlast(val);
               return;
        }

           Node n1= new Node(val);
           
           tail.Next = n1;
           tail = n1;
           size = size + 1;
            
        
    }

    public void Diplay(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"  -> ");
            temp = temp.Next;
            
        }
        System.out.println("END");
    }
    
     public static void main(String[] args) {
     
        LinkedList l1= new LinkedList();

        l1.Insertfirst(9);
        l1.Insertfirst(4);
        l1.Insertfirst(3);
        l1.Insertfirst(5);
        l1.Insertlast(78);

        l1.Diplay();
        l1.Insertlast(77);
        l1.Diplay();
        System.out.println(l1.size);


 }
}
