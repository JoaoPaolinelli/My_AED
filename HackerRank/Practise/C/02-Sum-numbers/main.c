#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int inteiro01, inteiro02;
    float flutuante01,flutuante02;

    scanf("%d %d", &inteiro01, &inteiro02);
   
    scanf("%f %f", &flutuante01, &flutuante02);
    
    
    int somaInt = inteiro01 + inteiro02;
    int diferencaInt = inteiro01 - inteiro02;

    
    float somaFloat = flutuante01 + flutuante02;
    float diferencaFloat = flutuante01 - flutuante02;

    printf("%d %d\n", somaInt, diferencaInt);
    printf("%.1f %.1f\n", somaFloat,diferencaFloat);
    return 0;
}