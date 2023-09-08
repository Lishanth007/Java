import java.util.InputMismatchException;
import java.util.Scanner;

class throwExample{
	
}

public class PassWord {
    
    public static void main(String[] args) {
        //throwExample th = new throwExample();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        int pass= sc.nextInt();
        int crtPass = 123;
        try{
        if (pass == crtPass) {
            System.out.println("Login successfully...");
        } else {
            System.out.println("Wrong password!!!");
        }
    }catch(InputMismatchException e){
        System.out.println(e.toString());
    }
        sc.close();
    }
}
