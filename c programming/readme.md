#include <stdio.h>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};

    printf("Array elements:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
#include <stdio.h>

int main() {
    int arr[5];

    printf("Enter 5 numbers:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nYou entered:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
