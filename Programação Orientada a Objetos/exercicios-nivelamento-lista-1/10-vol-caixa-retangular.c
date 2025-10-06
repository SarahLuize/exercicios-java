#include <stdio.h>
#include <stdlib.h>

int main()
{
    float comprimento, largura, altura, volume;

    printf("Informe o comprimento da caixa: \n");
    scanf("%f", &comprimento);

    printf("Informe a largura da caixa: \n");
    scanf("%f", &largura);

    printf("Informe a altura da caixa: \n");
    scanf("%f", &altura);

    volume = comprimento * largura * altura;

    printf("Volume da caixa: %.2f", volume);

    return 0;
}
