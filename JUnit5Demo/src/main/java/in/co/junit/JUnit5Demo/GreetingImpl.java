package in.co.junit.JUnit5Demo;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {

		if (name == null || name.length() == 0) {

			throw new IllegalArgumentException();

		}
		
		System.out.println(name);

		return "Hello " + name;
		
		
	}

}
