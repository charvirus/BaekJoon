#include <algorithm>
#include <cstdio>
using namespace std;


int main(void) {
    int n, sum = 0;
    scanf("%d", &n);
    int arr[20];

    for (int i = 0; i < n; i++) {
        int cnt = 0,num;
        scanf("%d", &num);
        for (int j = 0; j < 20; j++) {
            scanf("%d", &arr[j]);
        }

        for (int j = 0; j < 19; j++) {
            for (int k = j; k < 20; k++) {
                if (arr[j]>arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    cnt++;
                }
            }
        }
        printf("%d %d\n", num,cnt);
    }
}
