public class Greeter {

    public String genericGreeting(){
        return "Hey There!";
    }

    public String personalGreeting(String name){

        if(name.equals("")){
            throw new IllegalArgumentException("Name must not be empty!");
        }

        return "Hello, " + name + "!";
    }

}
