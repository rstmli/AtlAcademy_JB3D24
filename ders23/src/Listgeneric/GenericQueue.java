package Listgeneric;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GenericQueue<T> {
    Queue<T> queue = new PriorityQueue<>();
    public void enqueue(T e){
        queue.add(e);
    }
    public void dequeue(){
        queue.poll();
    }
    public void isEmpity(){
        try{
            queue.element();
        }catch (Exception e){
            System.out.println("queue ici bosdur.");
        }
    }

    public GenericQueue() {
    }
    public void displayInfo(){
        queue.forEach(System.out::print);
    }

    public static void main(String[] args) {
        GenericQueue queue1 = new GenericQueue();
        queue1.enqueue(1);
        queue1.enqueue(5);
        queue1.dequeue();
        queue1.dequeue();
        queue1.displayInfo();
        queue1.isEmpity();

    }
}
