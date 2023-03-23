
public class GreeterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter("Darth Vader");
		String greeting = greeter.sayHello();
		String refuseHelp = greeter.refuseHelp();
		String goodbye = greeter.sayGoodbye();
		
		System.out.println(greeting);
		System.out.println(refuseHelp);
		System.out.println(goodbye);
	}

}
