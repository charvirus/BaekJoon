#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, k, res = 0;
    cin >> n >> k;
    vector<int> arr;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        arr.push_back(x);
    }

    sort(arr.begin(), arr.end());
    int st = arr[0], en = arr[0] + k;
    while (st <= en) {
        int mid = (st + en) / 2;
        long long sum = 0;
        for (int i: arr) {
            if (mid > i) {
                sum += mid - i;
            } else {
                break;
            }
        }
        if (sum <= k) {
            st = mid + 1;
            res = max(res, mid);
        } else {
            en = mid - 1;
        }
    }
    cout << res;
}
