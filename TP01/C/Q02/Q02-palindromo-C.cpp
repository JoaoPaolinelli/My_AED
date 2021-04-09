//
// Created by johnny on 09/02/2021.
//

#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

bool ehFIM (char palavra[])
{
    bool resp=false;
    if(strlen(palavra)==3 && palavra[0]=='F'&& palavra[1]=='I'&& palavra[2]=='M' )
        resp = true;
    return resp;
}

char * inverter(char * palavra){
    int temp1, temp2;
    int tamanho = strlen(palavra);
    temp1 = tamanho -1;


    for (int i = 0; i < temp1; i++, temp1--) {
        temp2 = palavra[i];
        palavra[i] = palavra[temp1];
        palavra[temp1] = temp2;
    }
//    printf("%s\n", palavra);
    return palavra;
}

bool ehPalindromo(char palavra[500]) {
    bool resposta = true;
    char palavra_inversa[500];

    strcpy(palavra_inversa, palavra);
    inverter(palavra_inversa);

    if (strcmp(palavra_inversa, palavra) != 0) {
        resposta = false;
    }

    return resposta;
}
void funcaoPrint(bool resposta){
    if(resposta == true) { printf("SIM\n"); }
    else{ printf("NAO\n");}
}

void ler_palavra(char palavra[5555]){

    char letra;
    int contador=0;


    do {

        letra =getchar();
        palavra[contador]=letra;
        contador++;

    } while (letra != '\n');
    palavra[contador-1]='\0';

}

int main(){

    char palavra[555];


    ler_palavra(palavra);

    while (!ehFIM(palavra) ){

        funcaoPrint(ehPalindromo(palavra));
        ler_palavra(palavra);
    }
    return 0;
}