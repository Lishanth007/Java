import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        
        try{
            int result = a/b;
        System.out.println(result);
        }catch(ArithmeticException c){
            System.out.println(c.toString());
        }
        sc.close();
    }
}
