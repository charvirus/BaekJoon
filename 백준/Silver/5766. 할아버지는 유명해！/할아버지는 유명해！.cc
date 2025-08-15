#include <algorithm>
#include <iostream>
#include <map>
#include <vector>

using namespace std;
int n, m;

bool cmp(const pair<int, int> & a, const pair<int, int> & b) {
    if (a.second == b.second) {
        return a.first < b.first;
    }
    return a.second > b.second;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    while (true) {
        cin >> n >> m;
        if (n == 0 && m == 0) {
            break;
        }
        map<int, int> v;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t;
                cin >> t;
                v[t]++;
            }
        }
        vector<pair<int, int> > arr(v.begin(), v.end());
        sort(arr.begin(), arr.end(),cmp);
        int sec = arr[1].second;
        for (auto & i : arr) {
            if (i.second == sec) {
                cout << i.first << " ";
            }
        }
        cout << '\n';
    }
}
