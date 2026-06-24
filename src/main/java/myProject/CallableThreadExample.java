package myProject;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Define the Callable task
        Callable<String> callableTask = () -> {
            Thread.sleep(1000);
            return "Task completed successfully!";
        };
        
       // 2. Wrap the Callable inside a FutureTask
        FutureTask<String> futureTask = new FutureTask<>(callableTask);
        

        // 3. Pass the FutureTask to a raw Thread and start it
        Thread thread = new Thread(futureTask);
        thread.start();
        
        try {
            System.out.println("Waiting for the thread result...");
            // 4. Get the result
            String result = futureTask.get();
            System.out.println("Thread output: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        

	}

}
