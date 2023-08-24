import java.util.Scanner;

public class tri {
    public static void main(String123[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value:");
        int base = sc.nextInt();

        System.out.print("Enter the Height:");
        int height = sc.nextInt();

        double formula = 0.5 * base * height;
        System.out.println("Area of triangle:" + formula);
        sc.close();
    }
}
