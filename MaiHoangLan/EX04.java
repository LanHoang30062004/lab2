package MaiHoangLan;

import java.util.Scanner;

public class EX04 {
	public static int factorial(int n)
	{
		if (n == 0)
		{
			return 1 ; 
		}
		else 
		{
			int thuong = 1 ; 
			for (int i=1;i<=n;i++)
			{
				thuong = thuong*i ; 
			}
			return thuong ; 
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		System.out.print("Input n:");
		int n = sc.nextInt() ; 
		System.out.println("Result:"+factorial(n));
	}

}
