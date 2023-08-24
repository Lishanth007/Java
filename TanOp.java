import java.util.Scanner;

public class TanOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int Fnum = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int Snum = sc.nextInt();
        System.out.println("******************");
        System.out.println("Arithmetic operators");
        System.out.println("******************");
        // Arith Operator
        System.out.println("Add: " + (Fnum + Snum));
        System.out.println("Sub: " + (Fnum - Snum));
        System.out.println("MUl: " + (Fnum * Snum));
        System.out.println("Div: " + (Fnum / Snum));
        System.out.println("mode: " + (Fnum % Snum));
        System.out.println("******************");
        System.out.println("relational operators");
        System.out.println("******************");
        // Reation operator
        System.out.println("Compar :" + (Fnum == Snum));
        System.out.println("Not Equal :" + (Fnum != Snum));
        System.out.println("Greaterthan: " + (Fnum > Snum));
        System.out.println("Lesserthan: " + (Fnum < Snum));
        System.out.println("Great/less: " + (Fnum >= Snum));
        System.out.println("Great/less: " + (Fnum <= Snum));
        System.out.println("******************");
        System.out.println("logical operators");
        System.out.println("******************");
        // Logic Operator
        boolean logAnd = ((Fnum > Snum) && (Fnum < Snum));
        System.out.println("And :" + logAnd);

        boolean logOr = ((Fnum > Snum) || (Fnum < Snum));
        System.out.println("OR :" + logOr);

        boolean logNot = !(Fnum == Snum);
        System.out.println("Not :" + logNot);
        System.out.println("******************");
        System.out.println("ternery operator");
        System.out.println("******************");
        // Ternery operator
        String a = 1 > 2 ? "True value" : "Not true";

        int Fnumresult = (Fnum == 100) ? 100 : 00;
        System.out.println(Fnumresult);
        System.out.println(a);
        sc.close();
    }
}
