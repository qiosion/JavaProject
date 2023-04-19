public class argsTest {
    public static void main(String[] args) {

        String a = args[0];

        if (a.equals("a")) {
            System.out.println("HELLO");
        } else if (a.equals("b")) {
            System.out.println("World");
        }
    }
}
