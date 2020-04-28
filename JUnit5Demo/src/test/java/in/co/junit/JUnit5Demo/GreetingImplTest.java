package in.co.junit.JUnit5Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@BeforeEach
	public void setUp() {// To Create dependent object before running any test
							// case
		System.out.println("SETUP");

		greeting = new GreetingImpl();

	}

	@Test
	public void greetShouldReturnValue() {
		System.out.println("greetShouldReturnValue");
		String result = greeting.greet("JUNIT");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello JUNIT", result);

	}

	@Test/*(expected = IllegalArgumentException.class)*/
	public void greetThrowExceptionIfNameIsNull() {
		System.out.println("greetThrowExceptionIfNameIsNull");
		greeting.greet(null);
		Assertions.assertThrows(IllegalArgumentException.class,()->{});

	}

	@Test
	/* (expected = IllegalArgumentException.class) */
	public void greetThrowExceptionIfNameIsBlank() {
		System.out.println("greetThrowExceptionIfNameIsBlank");
		greeting.greet("");

	}

	@AfterEach
	public void cleanUp() {
		System.out.println("cleanUp");

		greeting = null;

	}

}
