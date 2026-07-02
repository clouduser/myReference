package myProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveWhieteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("demo class", "hand writing", "", " "));
		
		//list.removeIf(s -> s == null || s.isBlank());
		
		//list.stream().map(s-> s.toUpperCase() + ",").the
		
		System.out.println(""+list.stream().map(s-> s.toUpperCase() + ",").toList());
		
		
		List<String> list2 = Arrays.asList("apple banana", "orange grape");
        String result = list2.stream()
                // Split each string into words by whitespace and flatten to a single stream
                .flatMap(str -> Arrays.stream(str.split("\\s+")))
                .collect(Collectors.joining(","));        
        System.out.println(result); //apple,banana,orange,grape
        
        
	}

}
