package assi2010;
import java.util.Scanner;
public class Hcf {

	public static void main(String[] args) {
		
int num1 = 36;
int num2 = 60;
		
		
			int hcf=0;

		    for (int i = 1; i <= num1 || i <= num2; i++)
		      {
		     if (num1 % i == 0 && num2 % i == 0)
		        hcf = i;
		      }

		    System.out.println("The HCF: "+ hcf);
		  
		
		
		
	// by taking input from user	
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();
		
		{
			int hcf=0;

		    for (int i = 1; i <= num1 || i <= num2; i++)
		      {
		     if (num1 % i == 0 && num2 % i == 0)
		        hcf = i;
		      }

		    System.out.println("The HCF: "+ hcf);
		  }*/
		
	}

}
