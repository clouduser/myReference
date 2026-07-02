package myProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listInput = Arrays.asList("A","Ba","Csd");
		
		Map<String,Integer>  map = listInput.stream().collect(Collectors.toMap(Function.identity(), String::length));
				//System.out.println(""+map);

				
				Map<String,Integer>  demoMap = Map.of("a",1,"b",2,"c",3);
				
				demoMap.forEach((key,value) -> System.out.println(key +" "+ value));
				
				List<String>  aList = List.of("a","b","c");
				aList.forEach(s -> System.out.println(s.toUpperCase()));
				
	}

}
