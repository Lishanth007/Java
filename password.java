//Ask the user to enter a password
/* Enter a password:123
 * 
 * Login successful
 * Not matching-"Wrong password is entered"
 * 
 * both throw and throws
 */
import java.util.*;

class throwExample{
	
	public static void DivideANumber(int numerator,int denominator) throws ArithmeticException{
		
		int calculation=numerator/denominator;
		System.out.println("Result:"+calculation);
	}
	
	
}
public class Exceptions {
	public static void main(String[] args) {
    
		throwExample object1=new throwExample();
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Numerator:");
     int a=sc.nextInt();
     System.out.println("Enter a Denominator:");
     int b=sc.nextInt();
     
     try {
    	 object1.DivideANumber(a, b); 
     }
     catch(ArithmeticException e) {
    	 
    	 System.out.println("Denominator should not be Zero");
     }
   
	}
		
	
}
