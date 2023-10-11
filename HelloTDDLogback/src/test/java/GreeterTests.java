import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTests {

    //We need this object to call its methods
    Greeter greeter = new Greeter();

    //The foundation of TDD - writing unit tests first
    //These tests will fail at first, and it's our job to implement our methods to pass the tests

    @Test
    public void testGenericGreetingReturnsHello(){

        String result = greeter.genericGreeting();

        assertEquals("Hey There!", result);

    }


    @Test
    public void testPersonalGreetingWithValidArgument(){

        String result = greeter.personalGreeting("Gumby");

        assertEquals("Hello, Gumby!", result);

    }


    @Test(expected = IllegalArgumentException.class)
    public void testPersonalGreetingThrowsExceptionWithInvalidArgument(){

        greeter.personalGreeting("");

    }


}
