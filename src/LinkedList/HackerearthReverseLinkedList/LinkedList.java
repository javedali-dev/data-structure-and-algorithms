package LinkedList.HackerearthReverseLinkedList;


public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node insertAtHead(Node head,int data){
        Node node = new Node(data);
        node.next = head;
        head=node;
        return head;
    }

    Node insertAtTail(Node head, int data){
        Node node = new Node(data);
        node.next = null;
        Node temp  = head;
        if(temp==null)
        {
            head=node;
            return head;
        }
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = node;
        return head;

    }
    void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp= temp.next;
        }
    }
    void reverseNode(Node head){
        Node temp = head;
        while(temp.next!=null){
            if((temp.data)%2==0){
                Node newHead = null;
                while(((temp.data%2)==0)&&(temp.next!=null)){
                    newHead = insertAtHead(newHead,temp.data);
                    temp=temp.next;
                }
                if((temp.data)%2==0){
                    newHead = insertAtHead(newHead,temp.data);
                }
                display(newHead);
            }
            else{
                System.out.println(temp.data+" ");
                temp=temp.next;
            }

        }
        if(temp.next==null && temp.data%2!=0){
            System.out.println(temp.data+" ");
        }

    }




}
