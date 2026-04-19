#include <algorithm>
#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        int n, res = 0;
        cin >> n;
        int strt[1001], dst[1001];
        for (int i = 1; i <= n; i++) {
            strt[i] = i;
            cin >> dst[i];
        }
        for (int i = 1; i <= n; i++) {
            int idx = find(strt, strt + n + 1, dst[i]) - strt;
            for (int j = idx; j > i; j--) {
                swap(strt[j], strt[j - 1]);
                res++;
            }
        }
        cout << res << endl;
    }
}
