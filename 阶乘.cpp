#include<stdio.h>
int f(int n)
{
	if(n<=1) return 1;
	else  return n*f(n-1);
 	
}

int main()
{
	int n;
	int x;
	scanf("%d",&n);
	x=f(n);
	printf("%d\t",x);
		


	return 0;
}
