import java.util.*;

class throwExample{
	
	public static void CalculateSquare(int value) {
		
		if(value<1) {
			throw new ArithmeticException("Number must be positive");
		}
		else {
			int result=value*value;
			System.out.println(result);
		}
		
	}
	
}
public class Exceptions {
	public static void main(String[] args) {
    
		throwExample object1=new throwExample();
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Number:");
     int value=sc.nextInt();
     
     object1.CalculateSquare(value);
     
     
	}
		
	
}
