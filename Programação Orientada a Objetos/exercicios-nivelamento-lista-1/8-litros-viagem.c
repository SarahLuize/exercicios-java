#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_CTYPE, "");
    float tempo, velocidade, distancia, litros_usados;

    printf("Informe o tempo: \n");
    scanf("%f", &tempo);

    printf("Informe a velocidade m�dia: \n");
    scanf("%f", &velocidade);

    distancia = tempo * velocidade;

    litros_usados = distancia / 12;

    printf("Velocidade m�dia %.2f\n", velocidade);
    printf("Tempo gasto na viagem %.2f\n", tempo);
    printf("Dist�ncia percorrida %.2f\n", distancia);
    printf("Quantidade de litros utilizada na viagem %.2f\n", litros_usados);
    return 0;
}
