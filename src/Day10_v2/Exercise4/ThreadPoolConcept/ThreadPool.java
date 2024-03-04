package Day10_v2.Exercise4.ThreadPoolConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

    // variable
    // 1. all the task submitted in this que has to be runnable implementation
    // 2. this arraylist keep a list of pool thread runnables. it implement the
    // function of runnable interface (take task out of que, execute, etc.. )
    // 3. boolean tells wether this been told to shutdown/not/stopped/not.

    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    // constructor od ThreadPools take 2 parameter (no of thread, max no.of task)
    public ThreadPool(int noOfThreads, int maxNoOfTasks) {
        taskQueue = new ArrayBlockingQueue<Runnable>(maxNoOfTasks);

        for (int i = 0; i < noOfThreads; i++) { // start index 0, loop no of thread and index increase
            // for each iteration in this loop, it creates a poolThreadRunnable, & get
            // access to taskQueue
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }
        for (PoolThreadRunnable runnable : runnables) {
            new Thread(runnable).start();
            // constructor will loop all this PoolThreadRunnable and create a new thread and
            // call start
        }
    }

    // submit a task to the ThreadPool
    public synchronized void execute(Runnable task) throws Exception {
        if (this.isStopped) //check if the threadpool is stop, it will throw exception
            throw new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.offer(task); //if not stop, will simply enqueues the task in the task que
    }

    public synchronized void stop() {
        this.isStopped = true; //to stop ThreadPool
        for (PoolThreadRunnable runnable : runnables) { //will loop al the runnables
            runnable.doStop();
        }
    }

    public synchronized void waitUntilAllTasksFinished() {
        while (this.taskQueue.size() > 0) { //if the taskQueue size larger than 0, thread will sleep 1 milisecond
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
