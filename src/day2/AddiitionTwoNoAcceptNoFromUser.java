package day2;

import java.util.Scanner;

public class AddiitionTwoNoAcceptNoFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter 1 No");
		int n1=sc.nextInt();
		
		System.out.println("Please Enter 2 no");
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		System.out.println("The Sum Of given Digits are " + sum);
	}

}
