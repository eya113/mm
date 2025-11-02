
#include <stdio.h>
int main(){
float M;
int A[2][3]
{ {2,3,4},
  {8,8,6} };
int i,j;

int s = 0;
int c = 0;


for (i=0; i<2; i++)
{

for (j=0; j<3; j++){

s +=  A[i][j];
c++;
}
M =  s / c;
printf("La solution M = %f", M);
return 0;

 
         }
     }