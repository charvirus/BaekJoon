#include <stdio.h>
bool arr[5];

int main() {
    int n, a, b;
    scanf("%d", &n);
    if (n != 3)printf("Woof-meow-tweet-squeek");
    else {
        while (n--) {
            scanf("%d %d", &a, &b);
            a -= 1, b -= 1;
            arr[a] = arr[b] = true;
        }
        if (!arr[1] && !arr[4]) {
            printf("Wa-pa-pa-pa-pa-pa-pow!");
        } else {
            printf("Woof-meow-tweet-squeek");
        }
    }
}
