package myProject;

import java.util.HashSet;

public class MissingNumberXOR {
	
	public static void findMissing(int[] arr, int min, int max) {
        // Step 1: Insert all array elements into a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Step 2: Check every number in the expected range
        for (int i = min; i <= max; i++) {
            // Step 3: If the number is absent in the set, it's missing
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Input array containing duplicates and missing numbers
        int[] numbers = {1, 2, 3, 4, 6, 7, 9}; 
        
        // Find the range boundaries
        int min = 1;
        int max = numbers.length + 1;

        System.out.println("Missing numbers between " + min + " and " + max + ":");
        findMissing(numbers, min, max);
    

	}

}
