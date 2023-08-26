package MaiHoangLan;

import java.util.Scanner;

public class EX7 {
public static void sum(int n)
{
	int tong = 0 ; 
	int i ; 
	while(n!=0)
	{
		i=n%10 ; 
		tong = tong+i ; 
		n=n/10 ;
	}
	System.out.print("Sum:"+tong);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	System.out.print("Input:");
	int n = sc.nextInt() ; 
	sum(n);
	
}
}
