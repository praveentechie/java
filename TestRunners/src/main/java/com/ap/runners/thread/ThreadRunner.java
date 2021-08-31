package com.ap.runners.thread;

public class ThreadRunner implements Runnable {
    public static void main(String[] args) {
        ThreadRunner runner = new ThreadRunner();
        runner.createThread();
    }

    private void createThread() {
        // ### Thread: Create a new thread
        Thread thread1 = new Thread(new ThreadRunner(), "Thread-01");//(Runnable, Thread name)
        // ### Thread: starts the execution of the thread.
        // JVM calls the run() method on the thread.
        thread1.start();
    }

    // ### Thread: perform action for a thread
    @Override
    public void run() {
        System.out.println("Running thread " + Thread.currentThread().getName());
    }
}
