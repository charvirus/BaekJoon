#include <algorithm>
#include <cstdio>
using namespace std;

int arr[2][100005];

int main(void) {
    int n, ans=0;
    scanf("%d", &n);
    while (n--) {
        int size;
        scanf("%d", &size);
        for (int k = 0; k < 2; k++)
            for (int j = 2; j <= size + 1; j++)
                scanf("%d", &arr[k][j]);

        for (int j = 2; j <= size + 1; j++) {
            arr[0][j] += max(arr[1][j - 1], arr[1][j - 2]);
            arr[1][j] += max(arr[0][j - 1], arr[0][j - 2]);
        }
        ans = max(arr[0][size + 1], arr[1][size +1]);
        printf("%d\n", ans);
    }
}