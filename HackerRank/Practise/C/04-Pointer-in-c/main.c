#include <stdio.h>

void atualizar(int *valor01, int *valor02) {
    int x = *valor01;
    int y = *valor02;

    *valor01 = x + y;
    *valor02 = x - y;
    
   if (*valor02 < 0)
   {
       *valor02 *= -1;
   }
   
}

int main() {
    int valor01,valor02;

    int *ponteiroA = &valor01;
    int *ponteiroB = &valor02;

    scanf("%d %d", &valor01 , &valor02);
    atualizar(ponteiroA,ponteiroB);
    printf("%d\n%d\n", valor01, valor02);
    
}