package MaiHoangLan;

import java.util.Scanner;

public class EX6 {
public static Boolean check(int n)
{
	int tong = 0 ; 
	for (int i=1;i<=n/2;i++)
	{
		tong = tong+i ; 
	}
	if (tong!=n)
	{
		return false ; 
	}
	return true ; 
}
public static void genaratePerfect(int n)
{
	System.out.print("From 1 to "+n+" perfect number is:");
	for (int i=1;i<=n;i++)
	{
		if (check(i)== true)
		{
			System.out.print(i+" ");
		}
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	System.out.println("Input:");
	int n = sc.nextInt() ; 
	if (check(n)== true)
	{
		System.out.println("Its Perfect Number");
	}
	else 
	{
		System.out.println("Its not Perfect Number");
	}
	genaratePerfect(n);
}
}
