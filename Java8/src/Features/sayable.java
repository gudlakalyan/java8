package Features;

public interface sayable {
void say();
}
class MethodReference{
static void saysomething() {
	System.out.println("hello ");
}
public static void main(String[] args) {
	sayable saying = MethodReference::saysomething;
	saying.say();
}
}
