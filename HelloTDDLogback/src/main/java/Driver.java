public class Driver {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        System.out.println(greeter.genericGreeting());

        System.out.println(greeter.personalGreeting("Bon"));

        try{
            greeter.personalGreeting("");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
