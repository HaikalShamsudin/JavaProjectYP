package Day10_v2.Exercise4.ThreadPoolConcept;

import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {

    private Thread        thread    = null; 
    @SuppressWarnings("rawtypes")
    private BlockingQueue taskQueue = null; //representing the task queue from which tasks will be dequeued and executed.
    private boolean       isStopped = false; //indicating whether the thread associated with this instance should be stopped.

    public PoolThreadRunnable(@SuppressWarnings("rawtypes") BlockingQueue queue){
        taskQueue = queue; //constructor
    }

    //RUN METHOD
    public void run(){ 
        this.thread = Thread.currentThread();//this method will set the thread instance variable to the current thread executing this 'run' method
        while(!isStopped()){   //while loop continue as long as the isStopped method return 'false', indicate the thread should not be stop                          
            try{                //if PoolThreadRunnable not been asked to stop, it will take one Runnable out of taskQueue                    
                Runnable runnable = (Runnable) taskQueue.take();
                runnable.run();                         //take method here means if there are no task in taskQueue,
            } catch(Exception e){                           //the thread in PoolThreadRunnable is blocked indefinitely.
                //log or otherwise report exception,
                //but keep pool thread alive.
            }
        }
    }

    // STOP METHOD
    public synchronized void doStop(){
        isStopped = true;   //set isStopped to true
        //break pool thread out of dequeue() call.
        this.thread.interrupt(); // call if it is currently waiting for a task
    }

    //AFTER STOP METHOD
    public synchronized boolean isStopped(){
        return isStopped;
        //this method is synchronized and returns the current value of the isStopped flag, 
        //indicating whether the thread should be stopped.
    }
}

