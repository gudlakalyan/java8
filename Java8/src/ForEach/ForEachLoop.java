package ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Ra");
		li.add("Ga");
		li.add("J");
		li.add("RG");
		li.add("rg");

		li.forEach(str -> System.out.print(str));
		System.out.println("*************");
		
		li.forEach(System.out::print);
		System.out.println();
		
		System.out.println("*************");
		li.stream().forEach(str1 -> System.out.print(str1));
		
		
		
		
		System.out.println("**************");
		li.stream().forEach(str1 -> System.out.print(str1));
	}
}
