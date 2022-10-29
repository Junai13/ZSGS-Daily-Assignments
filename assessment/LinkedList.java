package assessment;

import java.util.Scanner;

public class LinkedList {
    node head = null;
    static class node {
        int val;
        node next;
        public node(int val) {
            this.val = val;
        }
    }
    private node sortedMerge(node n1, node n2) {
        node result = null;
        if (n1 == null)
            return n2;
        if (n2 == null)
            return n1;
        if (n1.val <= n2.val) {
            result = n1;
            result.next = sortedMerge(n1.next, n2);
        } else {
            result = n2;
            result.next = sortedMerge(n1, n2.next);
        }
        return result;
    }

    private node mergeSort(node n) {
        if (n == null || n.next == null) {
            return n;
        }
        node middle = getMiddle(n);
        node nextmiddle = middle.next;
        middle.next = null;
        node left = mergeSort(n);
        node right = mergeSort(nextmiddle);
        node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
    private node getMiddle(node n) {
        if (n == null)
            return n;
        node lastNode = n.next;
        node firstNode = n;
        while (lastNode != null) {
            lastNode = lastNode.next;
            if (lastNode != null) {
                firstNode = firstNode.next;
                lastNode = lastNode.next;
            }
        }
        return firstNode;
    }
    private void push(int new_data) {
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }
    private void printList(node headreference) {
        while (headreference != null) {
            System.out.print(headreference.val + " ");
            headreference = headreference.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list");
        for(int i=0;i<n;i++){
            linkedList.push(sc.nextByte());
        }
        /*System.out.println("Linked List without sorting is :");
        linkedList.printList(linkedList.head);*/
        linkedList.head = linkedList.mergeSort(linkedList.head);
        System.out.print("\n Sorted Linked List is: \n");
        linkedList.printList(linkedList.head);
    }

}
