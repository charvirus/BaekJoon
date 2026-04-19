#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, arr[5], cnt = 0;
    cin >> n;
    for (int i = 0; i < 5; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < 5; i++) {
        if (arr[i] == n) {
            cnt++;
        }
    }
    cout << cnt;
}
