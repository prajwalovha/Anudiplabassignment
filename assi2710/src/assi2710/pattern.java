package assi2710;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i will print row
     for(int i=1;i<=5;i++) 
     {
    	 for (int j=1;j<=5;j++)// j will print colum
    	 {
    		 if(j==1||i==5)
    		 { System.out.print("*");}// will print *
    		 else
    		 System.out.print(" ");// will print space
    	 }
    	 System.out.println();// for next line
     }
     
	}

}
