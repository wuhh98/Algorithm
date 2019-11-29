#include<stdio.h>
int fun(int *a,int y,int n){
	int left = 0;
	int right = n-1;
	while(left<=right){
		int i = (left+right)/2;
		if(y<a[i])
		{
			right = i-1;
		}
		if(y>a[i])
		{
			left = i+1;
		}
		if(a[i] == y)
		return i ;
	}
	return -1;
}
int main(){
	int a[10] =  {0,1,2,3,4,5,6,7,8,9};
	int x;
	scanf("%d",&x);
	int i;
	int n =10;
	i=fun(a,x,n);
	if(i==-1)
	printf("Î´ÕÒµ½");
	else	printf("%d",i);
	return 0;
}

