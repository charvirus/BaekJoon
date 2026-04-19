#include <algorithm>
#include <cstdio>
using namespace std;


int main(void) {
    int n,sum=0;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0;i<n;i++) {
        scanf("%d", &arr[i]);
    }
    sort(arr, arr+n);
    for (int i = 0;i<n-1;i++) {
        sum+=arr[i];
    }
    printf("%d", sum);

}