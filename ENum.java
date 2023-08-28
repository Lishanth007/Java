package StrManipulation;

import java.time.MonthDay;
import java.util.Scanner;

public class ENum {

	public enum week {
		 Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	public static void main(String[] args) {
		week day = week.Monday;
		Scanner sc = new Scanner(System.in);
		String arr = week;
		String val = sc.next();
		//String val = "Monday";
		if (val = arr) {
		switch (day) {
		case Monday:
			System.out.println("Today is monday");
			break;
		case Tuesday:
			System.out.println("Today is tuesday");
			break;
		case Wednesday:
			System.out.println("Today is wednesday");
			break;
		case Thursday:
			System.out.println("Today is thursday");
			break;
		case Friday:
			System.out.println("Today is friday");
			break;
		case Saturday:
			System.out.println("Today is saturday");
			break;
		case Sunday:
			System.out.println("Today is sunday");
			break;
		default:
			System.out.println("Not in week");
			break;
		}
		}
	}
}
