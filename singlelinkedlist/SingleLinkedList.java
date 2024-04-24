/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;
import java.util.*;
LinkedList.linklist = new LinkedList();

import java.util.*;

public class LinkedList {

	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Anand");
		ll.add("Sai");
		ll.addLast("Laxman");
		ll.addFirst("Kali");
		ll.add(2, "Krishna");

		System.out.println(ll);

		ll.remove("Sai");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}
/**
 *
 * @author amuly
 */
public class SingleLinkedList {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
