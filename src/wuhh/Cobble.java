package wuhh;

import java.util.Scanner;

public class Cobble {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入石子堆数：");
		int n = in.nextInt();
		int b =n;
		int k = 0;
		int sum = 0;
		int sum1 = 0;
		int[] cob = new int[n];
		int[] cob1 = new int[n];
		int[] add = new int[n];
		System.out.println("输入每堆石子个数");
		for(int i=0;i<n;i++) 
		{
			cob1[i] = cob[i] = in.nextInt();
			
		}
		while(n>2) {					//求最大积分
			for(int i=0;i<n;i++)
		{
			if(i<n-1)add[i] = cob[i] + cob[i+1];
			if(i==n-1)add[i] = cob[0] + cob[i];
			if(add[k]<add[i] && i>0 &&k<n-1)
			{
				k = i;
			}
		}
			sum += add[k]; 
		cob[k] = add[k];
		if(n-1==k)
		{
			for(int i=0;i<k;i++) 
			{
				cob[i] = cob[i+1];
			}
		}else 
		{
			for(int i=k+1;i<n-1;i++)
			{
				cob[i] = cob[i+1];
		}
		}
		n--;
		}
		sum += (cob[0] + cob[1]);
		System.out.print("最大得分：");
		System.out.println(sum);
		k =0;
		while(b>2) {					//求最小积分
			for(int i=0;i<b;i++)
		{
			if(i<b-1)add[i] = cob1[i] + cob1[i+1];
			if(i==b-1)add[i] = cob1[0] + cob1[i];
			if(add[k]>add[i] && i>0 &&k<b-1)
			{
				k = i;
			}
		}
			sum1 += add[k]; 
		cob1[k] = add[k];
		if(b-1==k)
		{
			for(int i=0;i<k;i++) 
			{
				cob1[i] = cob1[i+1];
			}
		}else 
		{
			for(int i=k+1;i<b-1;i++)
			{
				cob1[i] = cob1[i+1];
		}
		}
		b--;
		}
		sum1 += (cob1[0] + cob1[1]);
		System.out.print("最小得分：");
		System.out.println(sum1);
	}
}
