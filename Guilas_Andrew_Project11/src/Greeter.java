
public class Greeter {

	private String name;
	
	public Greeter(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello " + name + "!";
	}
	
	public String refuseHelp() {
		return "I'm sorry, " + name + ", I can't help you.";
	}

	public String sayGoodbye() {
		return "Goodbye " + name + "!";
	}
	
}
