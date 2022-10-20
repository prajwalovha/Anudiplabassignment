package Assign2;

public class Assending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "this is the easiest example";
		String[] list=str1.split("\\s"); 
		  for(int i=0;i<list.length;i++) 
		  { 
		  for(int j=i+1;j<list.length;j++) 
		  { 
		  if(list[i].length()>list[j].length()) 
		  { 
		  String temp= list[i]; 
		  list[i]=list[j]; 
		  list[j]=temp; 
		  } 
		  } 
		   } 
		  for(int i=0;i<list.length;i++) 
		  { 
		  System.out.println(list[i]+" ");  
		  }
	}

}
