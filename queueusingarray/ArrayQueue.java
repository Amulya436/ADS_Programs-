/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueusingarray;
import java.util.Arrays;
class ArrayQueue{
    private final int[] items;
    private int rear;
    private int count;
    
public ArrayQueue(int capacity){
    items=new int[capacity];
}
public void enqueue(int item){
    if (isFull()) {
        throw new IllegalStateException();
    }
    items[rear]= item;
    rear++;
    count++;
}
public int dequeue(){
    if(isEmpty()){
        throw new IllegalStateException();
        
    }
        int front = 0;
    var item = items[front];
    items[front] = 0;
    front++;
    count++;
    return item;
}
public int peek(){
    if(isEmpty()){
        throw new IllegalStateException();
        
    }
        int front = 0;
    return items[front];
}
public boolean isEmpty(){
    return count==0;
}
public boolean isFull(){
    return count==items.length;
}
  @Override
  public String toString(){
    return Arrays.toString(items);
  }
    
}
