#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, m, a, b,arr[100001] = {0};
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
        arr[i] += arr[i - 1];
    }
    while (m--) {
        cin >> a >> b;
        cout << arr[b] - arr[a - 1] << '\n';
    }
}