#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

	
int main() {
	
    char letra[100];
    char palavra[100];
    char frase[100];
    
    scanf("%[^\n]%*c", &letra);
    scanf("%[^\n]%*c", &palavra);
    scanf("%[^\n]%*c", &frase);
  	
    printf("%s\n", letra);
    printf("%s\n", palavra);
    printf("%s\n", frase);
    
    
    return 0;
}

