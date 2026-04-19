#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;
int n, ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 1; i < n; i++) {
        for (int j = i; j < n; j++) {
            int k = n - i - j;
            if (k < j) {
                break;
            } else if (i + j > k) {
                ans++;
            }
        }
    }
    cout << ans;
}
