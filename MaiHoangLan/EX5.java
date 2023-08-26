package MaiHoangLan;

import java.util.Scanner;

public class EX5 {
public static Boolean check(int n)
{
	if (n<2)
	{
		return false ; 
	}
	else 
	{
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if (n%i==0)
			{
				return false ; 
			}
		}
	}
	return true ; 
}
public static void primeSubmultiples(int n)
{
	if (check(n) == true)
	{
		System.out.print("Prime Submultiples:");
		for (int i=1;i<=n/2;i++)
		{
			if (n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	else {
		System.out.println("Not have prime submultiples ");
	}
}
public static void primes100()
{
	System.out.print("Prime from 1 to 100:");
	for (int i=2;i<=100;i++)
	{
		if (check(i)==true)
		{
			System.out.print(i+" ");
		}
	}
}
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in) ; 
	System.out.print("Input:");
	int n = sc.nextInt() ; 
	if (check(n)==true)
	{
		System.out.println("Its Prime");
	}
	else 
	{
		System.out.println("Not Prime");
	}
	primeSubmultiples(n);
	System.out.println();
	primes100();
	
}
}
