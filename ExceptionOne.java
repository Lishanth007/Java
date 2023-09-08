public class ExceptionOne {
    public static void main(String[] args) {
        // Exception 1
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException n) {
            System.out.println("String is not given");
        }
    }
}
