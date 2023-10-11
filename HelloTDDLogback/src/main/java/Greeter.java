import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeter {

    //Instantiate a Logger object for the Greeter class so we can trigger some logs
    private static final Logger logger = LoggerFactory.getLogger(Greeter.class);

    public String genericGreeting(){

        //INFO log - logs pertaining to typical application process
        logger.info("User got greeted!");

        return "Hey There!";
    }

    public String personalGreeting(String name){

        if(name.equals("")){

            //WARN log - logs that pertain to user error or potential security issues
            logger.warn("User tried to enter empty String for a name! what were they thinking?");

            throw new IllegalArgumentException("Name must not be empty!");
        }

        logger.info("User entered name: " + name);

        return "Hello, " + name + "!";
    }

}
