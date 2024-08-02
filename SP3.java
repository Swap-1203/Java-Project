public class Greeting {
    public static void main(String[] args) {
        // Check if the user has provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
