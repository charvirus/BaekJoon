#include <stdio.h>
int main() {
    int n,cnt = 1;
    scanf("%d", &n);
    while (n>=cnt) {
        n-=cnt;
        cnt++;
    }
    if (cnt%2) {
        printf("%d\n", cnt-n);
    }else {
        printf("0");
    }
}