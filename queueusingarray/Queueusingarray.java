package queueusingarray;




 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 

/**
 *
 * @author amuly
 */
public class Queueusingarray {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        queue.enqueue(60);
        
        
    }
}
    /**
     * @param args the command line arguments
     *
        // TODO code application logic here
    }
    

