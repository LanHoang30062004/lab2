package MaiHoangLan;

import java.util.Scanner;

public class EX10 {
public static int min(int a ,int b ,int c)
{
	int[]mang = new int [4] ; 
	mang[0] = a ; 
	mang[1] = b ;
	mang[2] = c ;
	int min = mang[0] ; 
	
	for (int i=1;i<3;i++)
	{
		if (mang[i]<min)
		{
			min = mang[i] ; 
		}
	}
	return min ; 
}
public static int Max(int mang[],int dem)
{
	int max = mang[0] ; 
	
	for (int i=1;i<dem;i++)
	{
		if (mang[i]>max)
		{
			max = mang[i] ; 
		}
	}
	return max ; 
}
public static void uocSo(int x , int y ,int min)
{
	int[]mang = new int[20] ; 
	int dem = 0 ; 
	for (int i=1;i<=min/2;i++)
	{
		if (min%i==0)
		{
			mang[dem] = i ; 
			dem++ ; 
		}
	}
	int[]mangUocSo = new int[20] ; 
	int demUocSo = 0 ; 

	for (int i=0;i<dem;i++)
	{
		if (x%mang[i]==0&&y%mang[i]==0)
		{
			mangUocSo[demUocSo] = mang[i] ; 
			demUocSo++ ; 
		}
	}
	int high = Max(mangUocSo, demUocSo) ; 
	System.out.println(high);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ; 
	System.out.print("Nhap a:");
	int a = sc.nextInt() ; 
	System.out.print("Nhap b:");
	int b = sc.nextInt() ; 
	System.out.print("Nhap c:");
	int c = sc.nextInt() ; 
	int min = min(a, b, c) ; 
    if(a!=min&&b!=min)
    {
    	uocSo(a, b, min);
    }
    else if(a!=min&&c!=min)
    {
    	uocSo(a, c, min);
    }
    if(c!=min&&b!=min)
    {
    	uocSo(c, b, min);
    }

}
}
