#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int n, m, inp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    vector<int> arr(m + 1), cnt(m + 1);

    for (int i = 0; i < n; i++) {
        int maxNum = 0;
        for (int j = 1; j <= m; j++) {
            cin >> inp;
            maxNum = max(inp, maxNum);
            arr[j] = inp;
        }

        for (int j = 1; j <= m; j++) {
            cnt[j] += (maxNum == arr[j]);
        }
    }
    for (int i = 1; i <= m; i++) {
        cout << n - cnt[i] << " ";
    }
}
