#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int n, m, res, s, e, sum;
vector<int> v;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> n;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        v.push_back(x);
    }
    cin >> m;
    sort(v.begin(), v.end());
    s = 0;
    e = v[n - 1];

    while (s <= e) {
        sum = 0;
        int mid = (s + e) / 2;
        for (int i = 0; i < n; i++) {
            sum += min(v[i], mid);
        }
        if (m >= sum) {
            res = mid;
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    cout << res;
}
