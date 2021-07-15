package LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
       /* for (int i = 0; i <5 ; i++) {
            linkedList.addLast(i);
        }*/
        linkedList.addLast("String1");
        linkedList.addLast("String2");
        linkedList.display();
        //System.out.println(linkedList.removeLast());
        //linkedList.display();
    }
}
