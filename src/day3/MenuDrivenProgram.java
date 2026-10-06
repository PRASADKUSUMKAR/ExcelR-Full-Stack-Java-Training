package day3;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);   //ctrl + shitt + O (Orange)
		

        System.out.println("Enter NO. 1 : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter NO. 2: ");
		int num2=sc.nextInt();
	
		int choice=0;
		do
		{
			System.out.println("### MENU ###");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0.Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			double result=0.0;
			
			switch(choice)
			{
			    case 1: result=num1+num2; break;
			    case 2: result=num1-num2; break;
			    case 3: result=num1*num2; break;
			    case 4: result=num1/num2; break;
			    case 0: System.exit(0);
			    default : System.out.println("Invali input");
			}
			System.out.println("Thanks ExcelR team And Umar Sir for Best Teaching");
			System.out.println("Result : "+result);
			}while(choice!=0);
	}   
	

}
