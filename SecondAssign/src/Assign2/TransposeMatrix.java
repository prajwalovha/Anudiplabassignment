package Assign2;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{4,5},{8,9}}; //a[3][2]
		int b[][] =new int [2][3]; //a transpose in b
		int mult=1;    
		
		System.out.println("Given matrix : ");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				b[j][i]=a[i][j];    // transpose logic
				System.out.print(a[i][j]+" "); //print given matrix a
			}
			System.out.println();
		}
		
		// transpose matrix
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(b[i][j]+" "); //print transpose matrix b
				
			}
			System.out.println();
		}
		
		// multiplication of matrix element
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++) //for loop
			{
				mult*=b[i][j];
				
			}
	}
		System.out.println("multiplication of all members in matrix : "+mult);
	}

}
