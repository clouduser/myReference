package myProject;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.ArrayDeque;
import java.util.Deque;

public class Java21 {

	public static void main(String[] args) throws IOException {
		
		//https://www.geeksforgeeks.org/java/java-jdk-21-new-features-of-java-21/
		
		//Pattern Matching Enhancements
		Object obj = 10;
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            default -> "Unknown";
        };
        System.out.println(result); //Integer: 10
        
       // ##3.String Templates (Preview Feature): String Templates provide a cleaner way 
       // #to embed expressions inside strings.
        //Before Java 21
        String name = "Nisha";
        System.out.println("Hello " + name + ", welcome to GeeksForGeeks!");
        
        String name1 = "Java 21";        
        // No import required to use STR.
       // String message = STR."Hello, \{name1}!"; 

       // With Java 21
       String name2 = "Nisha";
       //System.out.println(STR."Hello \{name2}, welcome to GeeksForGeeks!");
        
        
		
		//Virtual thread
		//DK 21 has introduced virtual threads to the Java platform, where as they can 
		//do tasks quickly without allocating much resources and space in the memory.
		Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread Running");
        });
		
		//2. Sequenced collections: New interfaces provide a consistent way to work with ordered 
		//collections, making it easy to: Access first and last elements and traverse 
		//collections forward or backward.
		Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("JDK 17");
        deque.addLast("JDK 21");
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
		
		
		//Performance Improvements
		
		
		//4. Tools Improvements
		//Java 21 enhances tools such as Runtime.exec() and ProcessBuilder, allowing better monitoring and logging of system processes.
		System.Logger logger = System.getLogger("java.lang.ProcessBuilder");
		ProcessBuilder processBuilder = new ProcessBuilder("ping", "www.google.com");
		logger.log(System.Logger.Level.TRACE, "Starting process...");
		Process process = processBuilder.start();
		
		//Java Emoji Support Tools
		//boolean isEmoji = Character.isEmoji("😀");
        //System.out.println(isEmoji);
		
		//Enhanced Lifecycle Management with HttpClient
        HttpClient client = HttpClient.newHttpClient();
        client.close();
        //Other lifecycle methods include:
    	//shutdown();
    	//shutdownNow();
    	//awaitTermination();
    	//isTerminated();
    	//These methods provide better control over HTTP request handling.
		
		//Repeated appending can be done efficiently using the existing
		StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(5));
        System.out.println(sb);
        //*****

	}

}
