#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int n,cnt=1;
    vector<pair<int, int> > list;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int s, e;
        cin >> e >> s;
        list.emplace_back(s, e);
    }
    sort(list.begin(), list.end());
    int end = list[0].first;
    for (int i = 1; i < n; i++) {
        if (end <= list[i].second) {
            end = list[i].first;
            cnt++;
        }
    }
    cout << cnt << '\n';
}
