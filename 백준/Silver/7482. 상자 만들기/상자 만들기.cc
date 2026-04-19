#include <cstdio>
int main() {
    int t;
    scanf("%d",&t);
    while (t--) {
        double a;
        scanf("%lf",&a);
        printf("%.10lf\n",a/6);
    }
}