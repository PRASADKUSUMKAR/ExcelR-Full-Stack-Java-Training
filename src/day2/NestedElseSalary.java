package day2;
import java.util.Scanner;

public class NestedElseSalary {

	public static void main(String[] args) {
		    Scanner    sc          = new Scanner(System.in);   
		
			System.out.println("Enter your Salary");       
		    int	 salary=sc.nextInt();  //percentage=25.0
			
			
			if(salary>=75000)  
			{					  
				System.out.println("Excellent");   
			}
			else if(salary>=60000)  
			{					  
				System.out.println("V Good");   
			}
			else if(salary>=50000) 
			{					  
				System.out.println("Good");   
			}
			else if(salary>=25000)
			{
				System.out.println("Ok");
			}
			else 
			{
				System.out.println("Not Ok");
			}

			
			    System.out.println("Be A Kind Person In Life");  //display" Thank You!!!

	}

}





                    
                         /// * monthlySalary >= 75,000   Excellent
                         // * monthlySalary >= 60,000   V Good
                         // * monthlySalary >= 50,000   Good
                          /////* monthlySalary >= 25000    OK
                          //* monthlySalary < 25000     Not OK
                          ///*