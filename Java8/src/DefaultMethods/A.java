package DefaultMethods;

interface b {
	void show();

	default int hello() {
		System.out.println("SYSO ");
		System.out.println("SYSO 2");
		System.out.println("SYSO 3333");
		return 6;
	}
	
	default String guten() {
		return "Guten Tag B Class";
	}
}

@FunctionalInterface
interface c {
	void show();
 
	default int hai() {
		return 10;
	}

	default String guten() {
		return "Guten Tag C Class";
	}

	default int hello() {
		return 9;
	}
}

public class A implements b, c {
	public static void main(String[] args) {
		A o = new A();
		c obj = new A();
		System.out.println(obj.hello());
		System.out.println(o.hai());
		
		c c = new A();
		System.out.println(c.guten());// calling abstract class
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public int hello() {
		// TODO Auto-generated method stub
		return b.super.hello();
	}
	/*
	 * @Override public int hello() { return c.super.hello(); }
	 */
	
	public String guten() {
		return b.super.guten();
	}
}
