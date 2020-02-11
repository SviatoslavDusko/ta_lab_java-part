package com.epam.lab.hw_7_8_collection.generics.priority_queue;

import com.epam.lab.hw_7_8_collection.generics.ship_with_droids.Droid;

public class Main {
    public static void main(String[] args) {
        Droid droid = new Droid("droid");

        MyPriorityQueue<Droid> myPriorityQueue = new MyPriorityQueue<>();

        myPriorityQueue.offer(new Droid("droid1"));
        myPriorityQueue.offer(new Droid("droid2"));
        myPriorityQueue.offer(new Droid("droid3"));
        myPriorityQueue.offer(new Droid("droid4"));
        myPriorityQueue.offer(new Droid("droid5"));
        myPriorityQueue.offer(droid);

        System.out.println(myPriorityQueue);
        System.out.println(myPriorityQueue.poll());
        System.out.println(myPriorityQueue);
        System.out.println(myPriorityQueue.peek());
        System.out.println(myPriorityQueue.contains(droid));
    }
}
