package Ifelse;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter no of sideup to 10");
		int A = Sc.nextInt();

		if (A==3)
		{
			System.out.println("the system is triangle");}
			
		else if (A==4)
		{System.out.println("the system is Square");}

		else if (A==5)
		{System.out.println("the system is Pentagon");}

		else if (A==6)
		{System.out.println("the system is Hexagon");}


		else if (A==7)
		{System.out.println("the system is Heptagpon");}

		else if (A==8)
		{System.out.println("the system is octagon");}

		else if (A==9)
		{System.out.println("the system is nonagon");}

		else if (A==10)
		{
			System.out.println("the system is decagon");}


		else 
			{System.out.println("enter valid no");}

	}
}
