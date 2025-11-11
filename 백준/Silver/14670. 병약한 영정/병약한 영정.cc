#include <cmath>
#include <cstring>
#include <iostream>
#include <vector>
using namespace std;
int n, m;
int a[101];
vector<int> ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    memset(a, -1, sizeof(a));
    cin >> n;
    while (n--) {
        int x, y;
        cin >> x >> y;
        a[x] = y;
    }
    cin >> n;
    while (n--) {
        bool chk = 1;
        ans.clear();
        cin >> m;
        while (m--) {
            int x;
            cin >> x;
            if (a[x] < 0)chk = 0;
            else ans.push_back(a[x]);
        }
        if (chk) {
            for (auto &x: ans) cout << x << " ";

            cout << "\n";
        } else
            cout << "YOU DIED\n";

    }
}