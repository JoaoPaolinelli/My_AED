#include <stdio.h>
#include <string.h>
#include <stdbool.h>

char * inverter(char * palavra){
    int temp1, temp2;
    int tamanho = strlen(palavra);
    temp1 = tamanho -1;


    for (int i = 0; i < temp1; i++, temp1--) {
        temp2 = palavra[i];
        palavra[i] = palavra[temp1];
        palavra[temp1] = temp2;
    }
    return palavra;
}
bool ehFim(char *fim){
    bool resp;
    if(strlen(fim) >= 3 && fim[0] == 'f' && fim[1] =='f' && fim[2] == 'm'){
        resp = true;
    }else{
        resp = false;
    }

    return resp;
}
char ehPalindromo(char palavra){
    char palavra_inversa[990];
    int equals = strcmp(&palavra, palavra_inversa);
    if(equals ==0 ){
        printf("\nTRUE");
    }else{
        printf("\nFALSE");
    }
    return palavra;
}

int main() {
    FILE *arquivo;
    arquivo = fopen("pub.in", "r");
    char palavra;
    char palindromo[999] ="";
    char * variavel = "b";
    char fim;

    do {




    }while( true != ehFim(palindromo));

    fclose(arquivo);

//    printf("\n%d LEGAL\n", ehFim(temp));
//    if(ehFim(temp) == true){
//        printf("\nITS THE END\n\n");
//    }else{
//        printf("\nFAKE NEWS\n");
//    }
// length palavra >= 0
//strlen()


//    printf("\nHello\n");
//    strcpy(inverter(palavra_inversa), palindromo);
//
//    printf("%s oie %s", palindromo, inverter(palavra_inversa));




//    if(palindromo == inverter(palavra_inversa)){
//        printf("\n\ntrue");
//        printf("%s HELLO %s", palindromo, inverter(palavra_inversa));
//    }else{
//        printf("\n\nFALSE");
//        printf("\n%s HELLO %s", palindromo, inverter(palavra_inversa));
//    }



//    printf("Insira a palavra\n");
//    scanf("%s", palindromo);
//
//    printf("%s\n",palindromo);
//
//    int tamanho = strlen(palindromo);
//
//    for( int i=tamanho-1; i >=0; i--){
//        char temp = palindromo[i];
//        palindromo[i] = palindromo[tamanho -i + 1 ];
//        palavra_inversa[tamanho -i -1] = temp;
//    }
//    if(palindromo == palavra_inversa){
//        printf("TRUE");
//    }else printf("FALSE\n");

//    printf("\n%s", palavra_inversa);
//    printf("\n%s", palindromo);



    return 0;
}
