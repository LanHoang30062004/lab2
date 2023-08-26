package MaiHoangLan;

import java.util.ArrayList;
import java.util.Scanner;

public class EX9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	ArrayList<Integer>mang = new ArrayList<Integer>() ; 
	System.out.print("Input:");
	int n = sc.nextInt() ; 
	int tich = 1; 
	int result = n ; 
	for (int i =2 ;i<=n;i++)
	{
		while(n%i==0)
		{
			mang.add(i) ; 
			tich = tich*i ; 
			n = n/i ; 
		}
	}
	if (tich == result)
	{
		int dem =1 ;
		System.out.print(tich+"=");
		for (Integer i :mang)
		{
		  System.out.print(i);
		  if (dem!=mang.size())
		  {
			  System.out.print("*");
			  dem++ ;
		  }
		}
	}
}
}
