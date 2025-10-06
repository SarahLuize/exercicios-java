#include <stdio.h>
#include <stdlib.h>

int main()
{
    float celsius, fahrenheit;

    printf("Conversao de graus Celsius em Fahrenheit\n");

    printf("Digite um grau Celsius: \n");
    scanf("%f", &celsius);

    fahrenheit = ((9.0 * celsius) + 160) / 5;

    printf("%.2f C em Fahrenheit : %.2f F", celsius, fahrenheit);

    return 0;
}
