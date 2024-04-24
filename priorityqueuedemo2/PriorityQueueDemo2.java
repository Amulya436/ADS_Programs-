/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueuedemo2;
import java.util.*;



/**
 *
 * @author amuly
 */

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(15,new MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }
 }
class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = (String) obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
