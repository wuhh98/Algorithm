package wuhh;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字三角形行数");
		int n = in.nextInt();
		int[][] number = new int[100][100];
		int[] number1 = new int[100]; 
		System.out.println("请输入数字三角形数");
		for(int i=0;i<n;i++)
			for(int j=0;j<=i;j++)
		{
			number[i][j] = in.nextInt();
		}
		for(int i=0;i<n;i++)
			{
			number1[i] = number[n-1][i];
		}
		for(int i= n-2;i>=0;i--)
			for(int j=0;j<=i;j++)
		{
			number1[j] = number[i][j]+ ((number1[j]>number1[j+1])? number1[j]: number1[j+1]); 
		}
		System.out.println(number1[0]);
	}

}
