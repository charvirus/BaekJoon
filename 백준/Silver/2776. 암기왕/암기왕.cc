#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int t, n, m, inp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t;
    while (t--) {
        vector<int>s;
        cin >>n;
        for (int i = 0; i < n; i++) {
            cin >> m;
            s.push_back(m);
        }
        sort(s.begin(), s.end());
        cin >> m;
        for (int i = 0; i < m; i++) {
            cin >> n;
            if (binary_search(s.begin(), s.end(), n)) {
                cout <<"1\n";
            }else {
                cout <<"0\n";
            }
        }
    }
}
