package myProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"Apple", "Banana" , "Orange"};
		String[] b = {"cat", "rat" };
		
		String[] merged = Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(String[]::new);
		
		Map<Character, Integer>  map = new HashMap();
		
		for(String arr : merged) {
			for(char c : arr.toCharArray()) {
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
		
		
		 List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

	        // Create a copy to avoid overwriting the original list1
	        List<Integer> common = new ArrayList<>(list1);
	        common.retainAll(list2);

	        System.out.println("Common numbers: " + common); // Output: [3, 4, 5]
	        
	        //////////////////////////////////////////
	        
	        List<String> words = List.of("hello world", "good morning");
	        List<String> flatMapped = words.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList();
	        
	        System.out.println(""+flatMapped); //[hello, world, good, morning]

	        
	        //Array find 2nd largest values	        
	        int[] aArrays = { 55, 12, 90, 43, 90, 75, 12 };

	        int secondLargest = Arrays.stream(aArrays)
	                .distinct()
	                .boxed()
	                .sorted((p, q) -> q - p)
	                .skip(1)
	                .findFirst().get();
	                //.orElseThrow(() -> new IllegalArgumentException("Array does not have a 2nd largest element"));

	        System.out.println("Second Largest: " + secondLargest);

	        
	}

}
