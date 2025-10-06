#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char nome[50], sobrenome[50], nome_completo[100];
    int i, j, len1, len2;

    printf("Digite um nome: \n");
    gets(nome);

    printf("Digite um sobrenome: \n");
    gets(sobrenome);

    len1 = strlen(nome);
    len2 = strlen(sobrenome);

    for(i=0;i<len1;i++){
        nome_completo[i] = nome[i];
    }

    nome_completo[len1] = ' ';

    j = len1+1;
    for(i=0; i<len2;i++){
        nome_completo[j+i] = sobrenome[i];
    }

    nome_completo[len1+len2+1] = '\0';
    printf("%s ",nome_completo);

    return 0;
}
