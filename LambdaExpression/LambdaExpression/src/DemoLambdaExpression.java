import java.util.ArrayList;

@FunctionalInterface
interface Action{
	public String say();
}
@FunctionalInterface
interface Action1{
	public String say(String word);
}
@FunctionalInterface
interface Action2{
	public int add(int a, int b);
}
public class DemoLambdaExpression {
	public static void main(String[] args) {
		/*Lambda Expression don't have parameter*/
		Action ac = () -> {
			return "I have nothing to say";
		};
		System.out.println(ac.say());
		/*Lambda Expression have 1 parameter*/
		Action1 ac1 = (word) -> {
			return word;
		};
		System.out.println(ac1.say("Hello"));
		/*Lambda Expression have 2 parameter*/
		Action2 ac2 = (int a, int b) -> {
			return a+b;
		};
		System.out.println("8 + 7 = " + ac2.add(8, 7));
		/*Lambda Expression with forEach()*/
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tuan");
		list.add("Tan");
		list.add("Thu");
		list.add("Hop");
		list.forEach((element) -> {
			System.out.println(element);
		});		
	}
}
