package assi2010;

public class assending {

	public static void main(String[] args) {
		// we have to arrenge word in assending order
String str1= "this is the easiest example";
		String[] list=str1.split("\\s"); // to sort the word
		 
		//using for loop to sort it
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
		  System.out.println(list[i]+" ");// to print word  
		  } 	
		
	}

}