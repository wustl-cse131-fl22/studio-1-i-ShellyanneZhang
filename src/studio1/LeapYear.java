package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner number1= new Scanner(System.in);
		System.out.print("enter year number: ");
		int leapyear = number1.nextInt();
		boolean  check1 = leapyear %4 ==0;
		boolean check2 = leapyear %100 !=0;
		boolean expcheck=leapyear%400 == 0;
		boolean totalcheck = ((check1==true)!=check2)==expcheck;
		System.out.println(leapyear+" is a leap year: "+totalcheck);
		
				// TODO Auto-generated method stub

	}

}
//int
//boolean
//int
//double
//string
//string
//double 