#include <algorithm>
#include <cstdio>
using namespace std;


int main(void) {
    int n;
    scanf("%d", &n);
    int arr[n]={0,};
    for (int i = 0; i < n-1; i++) {
        int j;
        scanf("%d", &j);
        arr[j-1]=1;
    }
    for (int i = 0;i<n;i++) {
        if (arr[i]==0) {
            printf("%d\n", i+1);
            break;
        }
    }

}