#include <stdio.h>
#include <stdlib.h>
void sum(int *a, int *b){
    int t;
    t = *a;
    *a = *b;
    *b = t;

}
void perm(int list[],int k,int m){
    int i;
    if(k==m)
    {
        for(i=0;i<=m;i++)
        {
            printf("%d",list[i]);
        }
        printf("\n");
    }
    else {

        for(i=k;i<=m;i++)
    {
        sum(&list[k],&list[i]);
        perm(list,k+1,m);
        sum(&list[k],&list[i]);

    }
    }

}

void main()
{
    int k=0;
    int m=3;
    int list[4]={1,2,3,4};
    perm(list,k,m);

}
