package myProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listInput = Arrays.asList("A","Ba","Csd");
		
		Map<String,Integer>  map = listInput.stream().collect(Collectors.toMap(Function.identity(), String::length));
				System.out.println(""+map);

	}

}
