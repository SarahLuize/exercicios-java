#include <stdio.h>
#include <stdlib.h>

int main()
{
    float total_gasto, distancia, consumo_medio;

    printf("Informe a distancia percorrida: \n");
    scanf("%f", &distancia);

    printf("Informe o total de combustivel gasto: \n");
    scanf("%f", &total_gasto);

    consumo_medio = distancia / total_gasto;

    printf("Consumo medio de combustivel: %.2f", consumo_medio);
    return 0;
}
