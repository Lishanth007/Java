import java.util.Scanner;

public class LogicOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int Fnum = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int Snum = sc.nextInt();

        boolean logAnd = ((Fnum > Snum) && (Fnum < Snum));
        System.out.println("And :" + logAnd);

        boolean logOr = ((Fnum > Snum) || (Fnum < Snum));
        System.out.println("OR :" + logOr);

        boolean logNot = !(Fnum == Snum);
        System.out.println("Not :" + logNot);
        sc.close();
    }
}
