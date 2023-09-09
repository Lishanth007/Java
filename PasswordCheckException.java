import java.util.*;

class check{

     public void PasswordCheck(int password, int pin) throws RuntimeException {
          if (password == pin) {
               System.out.println("Login successfully");
          }  else{
               throw new RuntimeException("Wrong password");
          }
     }

}

public class PasswordCheckException {
     public static void main(String[] args) {

          check obj = new check();

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the password: ");
          int pin = sc.nextInt();
          sc.close();
          
          try {
               obj.PasswordCheck(123, pin);
               
          } catch (RuntimeException e) {

              throw new RuntimeException("Wrong password");
          }
          
     }

}
