#include <stdio.h>
int main() {
    int n,ans = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int a,b;
        scanf("%d %d", &a, &b);
        int mod = ans % (a+b);
        if (mod<b) ans += b-mod;
        ans++;
    }
    printf("%d", ans);
}