#include <stdio.h>

int maior_numero(int a, int b, int c, int d) {
    int maior = 0;
    
    if(a > b) {
        maior = a;
    }else maior = b;
    if(maior < c){
        maior = c;
    }else if(maior < d){
        maior = d;
    }

    return maior;
    
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = maior_numero(a, b, c, d);
    printf("%d\n", ans);
    
    return 0;
}