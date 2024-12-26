package Listgeneric;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class GenericQueue<T> {
    Queue<T> queue = new PriorityQueue<>();



    public void add(T e){
        queue.add(e);
    }
    public void remove(){
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
        queue1.add(1);
        queue1.add(5);
        queue1.add(15);
        queue1.remove();
        queue1.remove();
        queue1.remove();
        queue1.displayInfo();
        queue1.isEmpity();

    }
}
