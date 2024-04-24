/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublylinkedlistmain;

/**
 *
 * @author amuly
 */
public class DoublyLinkedListMain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addLast(1);
        doublyLinkedList.addLast(2);
        doublyLinkedList.addLast(3);

        System.out.println("First element: " + doublyLinkedList.getFirst());
        System.out.println("Last element: " + doublyLinkedList.getLast());

        doublyLinkedList.addFirst(0);
        System.out.println("First element after adding at first: " + doublyLinkedList.getFirst());

        doublyLinkedList.removeLast();
        System.out.println("Last element after removing last: " + doublyLinkedList.getLast());

        doublyLinkedList.reverseTraversal();

    
        // TODO code application logic here
    }
    
}
