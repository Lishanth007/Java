import java.util.*;

public class MathOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st number: ");
        int Fnum = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int Snum = sc.nextInt();

        System.out.println("Add: "+(Fnum+Snum));
        System.out.println("Sub: "+(Fnum-Snum));
        System.out.println("MUl: "+(Fnum*Snum));
        System.out.println("Div: "+(Fnum/Snum));
        System.out.println("mode: "+(Fnum%Snum));
        sc.close();
    }
}
