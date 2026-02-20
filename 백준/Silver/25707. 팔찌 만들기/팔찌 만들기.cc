#include <algorithm>
#include <iostream>
using namespace std;
int n, arr[1001], cnt;

bool cmp(int a, int b) {
    return arr[a] > arr[b];
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    for (int i = 0; i < n-1; i++) {
        cnt += abs(arr[i] - arr[i + 1]);
    }
    cnt += abs(arr[n - 1] - arr[0]);
    cout << cnt;
}
