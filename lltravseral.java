class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class lltravseral {
    static  Node reverselll(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node revers2(Node head){
        if(head ==null || head.next ==null){
            return head;
        }
        Node newhead=revers2(head.next);
        head.next.next = head; // The crucial step: point the next node (which is now 'behind' head) back to hea

        head.next = null;
        return newhead;
    }
    static void printList(Node head) {
        Node temp = head;
        System.out.println("");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 public static void main(String[] args) {
    Node head =new Node(19);
    head.next = new Node(90);
    head.next.next = new Node(89);
   
    Node last =new Node(1000);
    Node first = new Node(69);
    first.next = head;
    head=first;
   Node temp =head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=last;
    Node temp2=head;
    // while(temp2!=null){
    //     System.out.print(temp2.data+" ");
    //     System.out.print("--> ");
    //     temp2 =temp2.next;
    // }
    // head = reverselll(head);
    head = revers2(head);
    printList(head);
 }
}
