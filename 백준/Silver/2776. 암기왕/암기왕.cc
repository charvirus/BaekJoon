#include <algorithm>
#include <iostream>
#include <map>

using namespace std;

int t, n, m, inp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t;
    while (t--) {
        map<int,int>mp;
        cin >> n;
        for (int i = 0; i < n; i++) {
            cin >> inp;
            mp[inp] = 1;
        }
        cin >> m;
        for (int i = 0; i < m; i++) {
            cin >> inp;
            if (mp[inp]) {
                cout <<"1\n";
            }else {
                cout <<"0\n";
            }
        }
    }
}
