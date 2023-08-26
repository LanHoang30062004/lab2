package MaiHoangLan;

import java.util.Scanner;

public class EX03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	int dem = 4 ; 
	System.out.print("Input n:");
	int n = sc.nextInt() ; 
	for (int i=1;i<=n;i++)
	{
		for (int a = 1;a<=dem;a++)
		{
			System.out.print(" ");
		}
		dem-- ; 
		if (i == 1)
		{
			System.out.print(i);
		}
		else 
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for (int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
		}
		System.out.println();
		
	}
}
}
