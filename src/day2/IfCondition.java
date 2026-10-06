package day2;
import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");       
		
		double percentage=sc.nextDouble();  
		
		
		if(percentage>=40.0)  //  is 38.5>=40.0  false   if will be skipped
		{					  
			System.out.println("Pass");   
		}
		else			
		{
			System.out.println("Failed");   
		}

		
		System.out.println("If Passed Then Great but If Failed Upskilling yourself");  
	}

}
