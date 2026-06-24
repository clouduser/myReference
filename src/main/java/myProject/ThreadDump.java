package myProject;

public class ThreadDump {
	
	private static Object resource1 = new Object();
	private static Object resource2 = new Object();

	public static void main(String[] args) {
		Thread t1 = prepareThread1();
		Thread t2 = prepareThread2();
		t1.start();
		t2.start();

	}
	
	private static Thread prepareThread1() {
		return new Thread(() 
				-> {
					
					System.out.println("Thread-1 : Trying to acuire lock on Resource1.......");
					
					synchronized(resource1) {
						System.out.println("Thread-1 : Locked Resource1");
						System.out.println("Thread-1 : Processing with Resource1 Before "
								+"Requesting Lock on Resource2");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Thread-1 : Trying to Acquire Lock on Resource2");
						synchronized(resource2) {
							System.out.println("Thread-1 : Locked Resource2");
							System.out.println("Thread-1 : Processing with Resource2");
							System.out.println("Thread-1 : Release Lock on Resource2");
						}
						System.out.println("Thread-1 Releasing the Lock on Resource1**************");
					}
					
				});
		
	}
	
	private static Thread prepareThread2() {
		return new Thread(() 
				-> {
					System.out.println("Thread-2 : Trying to Acquire Lock on Resource2..");
					synchronized(resource1) {
						System.out.println("Thread-2 : Locked Resource2");
						System.out.println("Thread-2 : Processing with Resource2 Before "
								+"Requesting Lock on Resource1");
						
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Thread-2 : Trying to Acquire Lock on Resource1");
						synchronized(resource2) {
							System.out.println("Thread-2 : Locked Resource1");
							System.out.println("Thread-2 : Processing with Resource1");
							System.out.println("Thread-2 : Releasing lock on Resource1");
						}
						System.out.println("Thread-2 Releasing the Lock on Resource2*****************");
						
						
					}
					
				});
	}

}
