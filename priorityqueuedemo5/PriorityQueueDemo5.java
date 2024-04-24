/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueuedemo5;
import java.util.PriorityQueue;
/**
 *
 * @author amuly
 */
public class PriorityQueueDemo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            PriorityQueue queue = new PriorityQueue();
         queue.offer(1);
         queue.offer(3);
         queue.offer(4);
         queue.offer(5);
         queue.offer(2);
         System.out.println(queue);
         while(!queue.isEmpty()){
             System.out.println(queue.remove());
         }
        
      
    }
    
}
