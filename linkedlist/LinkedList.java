/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;
import java.util.*;
/**
 *
 * @author amuly
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<String> llist = new LinkedList<>();

		llist.add("Anand");
		llist.add("Sai");
		llist.addLast("Laxman");
		llist.addFirst("Kali");
                llist.add(2, "Krishna");

		System.out.println(llist);

		llist.remove("Sai");
		llist.remove(3);
		llist.removeFirst();
		llist.removeLast();

		System.out.println(llist);
	}
}
        // TODO code application logic here
    
   
