#include <stdio.h>
using namespace std;
bool arr[5];
int n;
int main() {
    scanf("%d", &n);
    if (n != 3)printf("Woof-meow-tweet-squeek");
    else {
        while (n--) {
            int a, b;
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