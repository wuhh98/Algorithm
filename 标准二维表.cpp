#include<stdio.h>
 int count = 0;
 void swap(int *p,int *q){
 	int t;
 	t = *p;
 	*p = *q;
 	*q = t;
 }
 void perm(int list[] ,int k,int m){
 	int flag = 1 ;
 	int i,j;
 	if(k==m){
 		for(j=0;j<m/2;j++){
 			if(!(list[j]<list[j+1] && list[j]<list[j+m/2+1] && list[j+m/2+1]<list[j+m/2+2] && list[m] == m+1))
 				flag = 0;
 				}
 				if(flag==1){
 					count++;
 					for(i=0;i<=m;i++){
 						printf("%d",list[i]);
 						if(i == m/2)
 						printf("\n");
					 }
					 printf("\n\n");
				 }
		 
		 
	 }
 else {
		 	for(i=k;i<=m;i++){
		 		swap(&list[k],&list[i]);
		 		perm(list,k+1,m);
		 		swap(&list[i],&list[k]);
			 }
		 }
 }
 
 int main(){
 	int n,i,list[100] = {0};
 	for(i=0;i<100;i++){
 		list[i] = i+1;
	 }
 	scanf("%d",&n);
 	perm(list,0,2*n-1);
 	printf("%d",count);

 }
 
