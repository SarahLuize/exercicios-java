#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    float n1, n2, n3, n4, media;

    printf("Informe uma nota: \n");
    scanf("%f", &n1);

    printf("Informe uma nota: \n");
    scanf("%f", &n2);

    printf("Informe uma nota: \n");
    scanf("%f", &n3);

    printf("Informe uma nota: \n");
    scanf("%f", &n4);

    media = (n1+n2+n3+n4)/4.0;
    printf("Media: %.2f", media);
}
