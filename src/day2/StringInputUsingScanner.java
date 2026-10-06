package day2;
import java.util.Scanner;
public class StringInputUsingScanner {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   //ctrl + shitt + O (Orange)
		
		System.out.println("Please enter your name");
		String name=sc.next();  //entire string
		
		
		System.out.println(name);
		
		System.out.println("Please enter your name to show characters position");
		char ch=sc.next().charAt(0);// this gives char at 0th position
		System.out.println(ch);
 
	}

}
