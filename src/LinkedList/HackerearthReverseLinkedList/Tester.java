package LinkedList.HackerearthReverseLinkedList;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = null;
        for (int i = 0; i <n; i++) {
            int num = scanner.nextInt();
            head=linkedList.insertAtTail(head,num);
        }
        linkedList.display(head);
        linkedList.reverseNode(head);
    }
}
