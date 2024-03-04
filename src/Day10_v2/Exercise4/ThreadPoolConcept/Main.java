package Day10_v2.Exercise4.ThreadPoolConcept;

public class Main {

    public static void main(String[] args) throws Exception {

        //instantiate the THREADPOOL, which calling from the threadpool class
        ThreadPool threadPool = new ThreadPool(3, 10); //(number of thread, maximum number of task)
            
            for(int i=0; i<10; i++) {  //loop for 10 times (depends of no. of task)
            
            int taskNo = i;
            //calling execute with lambda for implementation the Runnable interface
            //of runnable interface
            threadPool.execute( () -> {                       //it submit 10 task to the thread pool,
                String message =                               // each task print a message indicate the thread name and task number
                        Thread.currentThread().getName()
                                + ": Task " + taskNo ;
                System.out.println(message);
            });
        }

        threadPool.waitUntilAllTasksFinished(); //wait the task to finish and stops the thread pool
        threadPool.stop();

    }
}
