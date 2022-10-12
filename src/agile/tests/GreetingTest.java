package agile.tests;

import agile.Greeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {

    @Test
    public void shouldCreateGreeting_forOneName() {
        Greeting greeting = new Greeting("Hello", "friend!");
        assertEquals("Hello Ada", greeting.greet(new String[] { "Ada" }));
    }
}
