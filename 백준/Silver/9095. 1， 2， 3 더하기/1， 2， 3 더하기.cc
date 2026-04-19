#include <cstdio>
#define endl "\n"

int main() {
    int dp[11],a,b;
    dp[1]=1;
    dp[2]=2;
    dp[3]=4;
    scanf("%d", &a);
    for(int i=4;i<11;i++) {
        dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
    }
    for(int i=0;i<a;i++) {
        scanf("%d",&b);
        printf("%d\n",dp[b]);
    }
}