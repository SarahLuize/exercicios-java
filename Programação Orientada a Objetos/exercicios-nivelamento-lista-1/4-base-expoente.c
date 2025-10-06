#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int n1, n2, resultado;

    printf("Informe a base: \n");
    scanf("%d", &n1);
    printf("Informe o expoente: \n");
    scanf("%d", &n2);

    resultado = pow(n1, n2);

    printf("Resultado: %d", resultado);
    return 0;
}
