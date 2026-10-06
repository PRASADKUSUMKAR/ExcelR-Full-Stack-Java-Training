package day2;
import java.util.Scanner;
public class AddHeightOfTwoPeople {

	public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter Height of Person 1 in CM");
            double height1=sc.nextDouble();
            System.out.println("Ener Height of Person 2 in CM");
            double height2=sc.nextDouble();
            
            double sumHeight=height1+height2;
            System.out.println("The sum of Height is in cm " +sumHeight);
            

	}

}
