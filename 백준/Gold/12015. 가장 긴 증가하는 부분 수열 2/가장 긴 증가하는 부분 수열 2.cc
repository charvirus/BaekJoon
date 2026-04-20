#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int n, inp, cidx;
vector<int> a, ans;

int idx_binary_search(int idx) {
    int left = 0, right = ans.size() - 1, mid;
    while (left < right) {
        mid = (left + right) / 2;
        if (ans[mid] >= idx) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return right;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> inp;
        a.emplace_back(inp);
    }
    ans.emplace_back(a.front());
    for (int i = 1; i < n; i++) {
        if (a[i] > ans.back()) {
            ans.emplace_back(a[i]);
        } else {
            cidx = idx_binary_search(a[i]);
            ans[cidx] = a[i];
        }
    }
    cout << ans.size();
}
