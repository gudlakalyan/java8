package Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithList {
	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("J");
		li.add("Ra");
		li.add("Ga");
		li.add("RG");
		li.add("mf");
		li.add("EO");
		li.forEach((names) -> System.out.print(names));
	}
}
