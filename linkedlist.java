import java.util.*;
class linkedlist
{
    
    public static void main(String[] args) 
    {
        Node n1 = new Node(10); 
        Node n2 = new Node(15); 

        n1.next = n2;
        Node cur = n1;
while (cur.next.next != null) {
    cur = cur.next;
}
cur.next = null;
        printList(n1);


    }
    static void printList(Node head)
    {
        Node current = head;
        while(current !=null){
            System.out.println(current.val + " " );
            current = current.next;
        }
    }
    
    
}
class Node
{
        int val;
        Node next;
        Node(int val)
        {
            this.val =val;
            this.next = null;
        }
        
    }
