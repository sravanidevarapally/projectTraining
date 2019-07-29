package io.javaLambdas;

public class Greeter {

	public void greet(Greeting greeting) {
		//System.out.println("Hello World");
		greeting.perform();
	}
	public static void main (String args[]) {
		Greeter greeter = new Greeter();
		GreetingMessage message = new GreetingMessage();
		greeter.greet(message);
		
	}
}
