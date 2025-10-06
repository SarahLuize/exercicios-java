#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n1, n2, resultado;
    printf("Digite um numero: \n");
    scanf("%d", &n1);

    printf("Digite um numero: \n");
    scanf("%d", &n2);

    resultado = n1+n2;

    printf("Resultado: %d", resultado);
    return 0;
}
