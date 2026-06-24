package myProject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReproduceCME {

	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> sharedList = new CopyOnWriteArrayList<>();
		
		for(int i =0;i < 10 ; i++) {
			sharedList.add(i);
		}
		
		
		Thread thread1 = Thread.ofVirtual()
				.name("")
				.start(() -> { 
					System.out.println("");
				});
		
		Thread thread = Thread.ofVirtual()
                .name("my-virtual-thread")
                .start(() -> {
                    System.out.println("Running on: " + Thread.currentThread());
                });
		
		thread.join();
		
		Thread readThread = new Thread(
				() -> {
					for(Integer intValue : sharedList) {
						System.out.println(""+intValue);
					}					
					
				});
		
		Thread writeThread = new Thread(
				() -> {
					for(Integer intValue : sharedList) {
						sharedList.remove(1);
						sharedList.add(11);
					}					
					
				});
		
		writeThread.start();
		readThread.start();
		
		

	}

}
