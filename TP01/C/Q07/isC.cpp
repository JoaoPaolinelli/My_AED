#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

const int NUMLINHA = 555;
const int TAMPALAVRA = 5555;

bool ehFim(char *fim){
    bool resp;
    if(strlen(fim) >= 3 && fim[0] == 'F' && fim[1] =='I' && fim[2] == 'M'){
        resp = true;
    }else{
        resp = false;
    }

    return resp;
}

bool isVogal(char palavra[5555]){
    bool Vogal = true;
//    printf("isVogal PRINT\n");

    for(int i =0; i < strlen(palavra) && Vogal; i++){
        if(palavra[i] != 'a' && palavra[i] != 'e' && palavra[i] != 'i' && palavra[i] != 'o' && palavra[i] != 'u'){
            Vogal = false;
        }
    }
//    if(Vogal == true){
//
//        printf("SIM 1 ");
//    }else printf("NAO 1 ");
    return Vogal;
}

bool isConsoante(char palavra[5555]){
    bool Consoante = true;
//    printf("isConsoante PRINT\n");
    for(int i =0; i < strlen(palavra) && Consoante; i++){
        if(palavra[i] <= '9' || palavra[i] == 'a' || palavra[i] == 'e' && palavra[i] == 'i' && palavra[i] == 'o' && palavra[i] == 'u'){
            Consoante = false;
        }
    }
//    if(Consoante == true){
//        printf("SIM 2 ");
//    }else printf("NAO 2 ");

    return Consoante;
}
bool isInteiro(char palavra[5555]){
    bool Inteiro = true;
//    if(palavra[i] != '1' || && palavra[i] <='9')
//    printf("isInteiro PRINT\n");
    for (int i = 0; i < strlen(palavra) && Inteiro; i++) {
        if(palavra[i] != 1 || palavra[i] != 2 || palavra[i] != 3 || palavra[i] != 4 || palavra[i] != 5 || palavra[i] != 6|| palavra[i] != 7 || palavra[i] != 8 || palavra[i] != 9){
            Inteiro = true;
        }else
            Inteiro = false;
//        if(isdigit(strtol(palavra, NULL, 10))){
//            Inteiro = true;
//        }

    }
//    if(Inteiro == true){
//        printf("SIM 3");
//    }else printf("NAO 3");

    return Inteiro;
}
bool isReal(char palavra[5555]){
    bool isReal = true;
    int contVirgula =0;
    for (int i = 0; i < strlen(palavra) && isReal ; i++) {

        if(palavra[i] <= 9 || palavra[i] == '.' || palavra[i] == ','){

            if(palavra[i] == '.' || palavra[i] == ','){
                contVirgula++;
            }
        }else {
            isReal = false;
        }
    }
    if (contVirgula > 1 || contVirgula < 0){
        isReal = false;
    }
    return isReal;
}
//bool isReal(char palavra[5555]){
//
//}
void funcaoPrint(char palavra[5555]){

    if(isVogal(palavra) == true){
        printf("SIM ");
    }else printf("NAO ");

    if(isConsoante(palavra) == true){
        printf("SIM ");
    }else printf("NAO ");

    if(isInteiro(palavra)== true){
        printf("SIM ");
    }else printf("NAO ");

    if(isReal(palavra)== true){
        printf("SIM ");
    }else printf("NAO ");
    printf("\n");
}



int main(){


    char entrada[NUMLINHA][TAMPALAVRA];
    int numEntrada = 0;
    strcpy(entrada[0], "aeiou");
    strcpy(entrada[1], "zxcv");
    strcpy(entrada[2],"123");

//    isVogal(strcpy(entrada[0],"aeiou"));
//    isConsoante(entrada[1]);
//    isInteiro(entrada[2]);

    do {
        scanf("%[^\n]%*c", entrada[numEntrada]);
    }while(ehFim(entrada[numEntrada++]) == false);
    numEntrada--;
        for (int i = 0; i < numEntrada ; i++) {
            funcaoPrint(entrada[i]);
//        isVogal((entrada[i]));
//        isConsoante((entrada[i]));
//        isInteiro((entrada[i]));
    }


//    do {
//        scanf("%[^\n]%*c", entrada[numEntrada]);
//    }while(ehFim(entrada[numEntrada++]) == false);
//    numEntrada--;

//    for (int i = 0; i < numEntrada ; i++) {
//        funcaoPrint(entrada[i]);
//    }

//    while (!ehFim(palavra) ){
//
//        funcaoPrint(palavra);
//        ler_palavra(palavra);
//    }
    return 0;


}