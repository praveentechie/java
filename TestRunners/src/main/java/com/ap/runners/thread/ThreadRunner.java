package com.ap.runners.thread;

public class ThreadRunner implements Runnable {
    private final ThreadHelper threadHelper = new ThreadHelper();
    public static void main(String[] args) {
        ThreadRunner runner = new ThreadRunner();
        runner.createThread();
    }

    private void createThread() {
        // ### Thread: Create a new thread
        Thread thread1 = new Thread(new ThreadRunner(), "Thread-01");//(Runnable, Thread name)
        Thread thread2 = new Thread(new ThreadRunner(), "Thread-02");//(Runnable, Thread name)
        // ### Thread: starts the execution of the thread.
        // JVM calls the run() method on the thread.
        thread1.start();
        thread2.start();
    }

    // ### Thread: perform action for a thread
    @Override
    public void run() {
        System.out.println("Running thread " + Thread.currentThread().getName());
        //print();
        try {
            Thread.sleep(Math.round(Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //syncPrint();
        syncPrintHelper();
    }

    void syncPrintHelper() {
        synchronized (threadHelper) {
            threadHelper.syncPrintTest();
        }
    }

    /*
    * Non synchronized code.
    * Values will be printed in random order for both the threads
    * */
    private void print() {
        for (int index = 5; index > 0; index--) {
            System.out.println(index + " for thread " + Thread.currentThread().getName());
        }
    }

    /*
    * Synchronized code
    * When one thread is accessing the resource other will not be able to access it.
    * */
    private void syncPrint() {
        synchronized (this) {
            for (int index = 5; index > 0; index--) {
                System.out.println(index + " sync for thread " + Thread.currentThread().getName());
            }
        }
    }
}

class ThreadHelper {
    void syncPrintTest() {
//        synchronized (this) {
            for (int index = 5; index > 0; index--) {
                System.out.println(index + " helper for thread " + Thread.currentThread().getName());
            }
//        }
    }
}
