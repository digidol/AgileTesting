package agile;

public class Main {

    public static void main(String[] args) {
        Greeting greeting = new Greeting("Hello", "friend!");
        System.out.println(greeting.greet(new String[] { "neil" } ));
    }
}
