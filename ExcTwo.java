public class ExcTwo {
    public static void main(String[] args) {

        try {
            String language = "12";
            int l = Integer.parseInt(language);
            System.out.println(l);
        } catch (NumberFormatException n) {
            System.out.println("Data Type is wrong");
        }
    }
}
