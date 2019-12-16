package Features;

interface say {
	public void sayi();
}

public class MethodVariable {
	public static void m1() {
		System.out.println("Hello ");
	}

	public static void main(String[] args) {
		say s = MethodVariable::m1;
		s.sayi();
	}
}
