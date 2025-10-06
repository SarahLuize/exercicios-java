#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define pi 3.14159

int main()
{
    float area, raio, circunferencia;

    printf("Raio: \n");
    scanf("%f", &raio);

    area = pi * pow(raio,2);

    printf("Area: %f", area);
    return 0;
}
