#include <iostream>
#include <string>
#include <map>
using namespace std;
map<string, int> mp;
map<string, int> :: iterator it;
int n, m,cnt;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n >> m;
    for (int i = 0; i < n+m; i++) {
        string inp;
        cin >> inp;
        mp[inp]++;
        if (mp[inp] == 2) {
            cnt++;
        }
    }
    cout << cnt << '\n';
    for (it = mp.begin(); it != mp.end(); it++) {
        if (it->second == 2) {
            cout << it->first << '\n';
        }
    }
}
