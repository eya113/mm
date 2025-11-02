#include <stdio.h>

int main() {
    int n = 6;
    int A[6] = {7, 8, 5, 6, 3}; // ⚠️ Seulement 5 valeurs → une case vide
    int k = 2;
    int v = 66;

    // Décalage vers la droite
    for(int i = n - 2; i >= k; i--) {
        A[i+1] = A[i];
    }
    
    // Insertion
    A[k] = v;
    
    // Affichage du tableau
    for(int i = 0; i < n; i++) {
        printf("%d ", A[i]);
    }

    return 0;
}
