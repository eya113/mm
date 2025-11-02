#include <stdio.h>
int main() {
    int n = 5;
    int A[5] = {5, 6, 7, 8, 9};
    int k = 2;
    int i;
    

    // Décalage vers la droite
    for (i = k ; i < n-1 ; i++){
    	 A[i] = A[i+1];
	}
	for(int i = 0; i < n-1; i++) {
        printf("%d ", A[i]);
    }
     
}
       