import java.util.Scanner;

public class RelationOper {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st number: ");
        int Fnum = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int Snum = sc.nextInt();

        System.out.println("Compar :"+(Fnum==Snum));
        System.out.println("Not Equal :"+(Fnum!=Snum));
        System.out.println("Greaterthan: "+(Fnum>Snum));
        System.out.println("Lesserthan: "+(Fnum<Snum));
        System.out.println("Great/less: "+(Fnum>=Snum));
        System.out.println("Great/less: "+(Fnum<=Snum));
        sc.close();
    }
}
