package com.multiThread;
class SumOfSquaresTask extends Thread {
    private int start, end;
    private long result;

    public SumOfSquaresTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {
        result = 0;
        for (int i = start; i <= end; i++) {
            result += (long) i * i;
        }
    }
}

public class SumOfSquaresMultiThread {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100;
        int numThreads = 4;

        int step = (rangeEnd - rangeStart + 1) / numThreads;
        SumOfSquaresTask[] tasks = new SumOfSquaresTask[numThreads];
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = rangeStart + i * step;
            int end = (i == numThreads - 1) ? rangeEnd : start + step - 1;
            tasks[i] = new SumOfSquaresTask(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        long totalSum = 0;
        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
                totalSum += tasks[i].getResult();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of squares: " + totalSum);
    }
}