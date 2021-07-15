package LinkedList;

public class LinkedList<E>{

    class Node<E> {
        E data;
        Node next;
        public Node(E obj){
            data= obj;
            next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;
    public LinkedList(){
        head=null;
        currentSize = 0;
    }

    public void addFirst(E obj){
        Node<E> node = new Node<E>(obj);
        node.next=head;
        head = node;
        currentSize++;
    }

    public void addLast(E obj){
        Node<E> node = new Node<E>(obj);
        if(head==null){
            head=tail=node;
            currentSize++;
            return;
        }
        tail.next=node;
        tail=node;
        currentSize++;
        return;
    }

    public E removeFirst(){
        if (head==null){
            return null;
        }
        E temp = head.data;
        if(head==tail){
            head=tail=null;
        }
        else{
            head= head.next;
        }
        currentSize--;
        return temp;
    }

    public E removeLast(){
        if(head == null){
            return null;
        }
        if(head==tail){
            return removeFirst();
        }
        Node<E> current = head, previous =null;
        while(current!=tail){
            previous = current;
            current= current.next;
        }
        previous.next = null;
        tail = previous;
        currentSize--;
        return current.data;
    }

    public void display(){
        Node<E> temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
}
