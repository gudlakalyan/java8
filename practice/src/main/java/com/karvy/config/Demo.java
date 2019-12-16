package com.karvy.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	private void demo() {
		System.out.println(">>>>>>>>>>>>>>");

	}
	public static void main(String[] args) {
		
//		System.out::println("test");

		// Get the stream 
        Stream<String> stream 
            = Stream.of("Geeks", "For", 
                        "Geeks", "A", 
                        "Computer", 
                        "Portal"); 
  
        // Print the stream 
        // using double colon operator 
        stream.forEach(System.out::println);
        
        List<String> l = new ArrayList<String>();
        l.add("one");
        l.add("two");
        l.add("three");
        
                
	}
}
