package MaiHoangLan;

import java.util.Scanner;

public class EX1 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	int dem=0 ; 
	System.out.print("Input n:");
	int n = sc.nextInt() ; 
	for (int i=1;i<=n;i++)
	{
		for (int k=1;k<=n-dem;k++)
		{
			System.out.print(i);
		}
		dem++ ; 
		System.out.println();
	}
}
}
