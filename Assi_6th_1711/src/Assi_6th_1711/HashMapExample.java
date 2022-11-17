package Assi_6th_1711;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,Integer> Sc=new HashMap<>();
		for (int i=1;i<=15;i++)
		{
			int SQU=i*i;
			Sc.put(i, SQU);
		}
		
		System.out.println(Sc);
		
	}

}
