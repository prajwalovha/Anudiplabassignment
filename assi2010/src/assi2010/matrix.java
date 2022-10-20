package assi2010;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{1,2},{4,5},{8,9}};
		int b[][]= new int [2][3];
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
			System.out.println("transpose of given mayrix is");
		for(int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
			
		}
		//multipilcation of the given matrix is
		System.out.println("multipilcation of the given matrix is");
		int mul=1;
		for(int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[i].length;j++)
			{
				mul*=b[i][j];
			}
			
		}
		System.out.println(mul);
		
		
	}

}
