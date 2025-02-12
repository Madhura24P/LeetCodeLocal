package com.datastruc;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueueUsingLinkedList<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;

    public BlockingQueueUsingLinkedList(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(T item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(item);
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T item = queue.poll();
        notifyAll();
        return item;
    }

    public static void main(String[] args) {
    	BlockingQueueUsingLinkedList<Integer> blockingQueue = new BlockingQueueUsingLinkedList<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    blockingQueue.put(i);
                    System.out.println("Produced: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Integer item = blockingQueue.take();
                    System.out.println("Consumed: " + item);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

