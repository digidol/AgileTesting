package agile.tests;

/* This is the class that we are testing */
import agile.Greeting;

/* We need this so that we can add an @Test to the start of each test method */
import org.junit.jupiter.api.Test;

/* This is a special type of import, which gives us access to the assert methods */
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is an example file that shows the setup for adding Unit tests.
 * You are not expected to edit this code. Instead, create your own Test class,
 * for example GreetingTest and then add it to the repository. Write your
 * tests for this practical in your test class.
 */
public class ExampleGreetingTest {

    @Test
    public void shouldCreateGreeting_forOneName() {
        Greeting greeting = new Greeting("Hello", "friend!");
        assertEquals("Hello, Ada", greeting.greet(new String[] { "Ada" }));
    }
}
