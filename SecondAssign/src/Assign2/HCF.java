package Assign2;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		  }
	}

}
