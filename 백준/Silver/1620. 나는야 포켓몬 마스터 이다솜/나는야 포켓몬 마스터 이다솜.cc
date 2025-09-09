#include <iostream>
#include <string>
#include <map>
using namespace std;
map<string, int> s2i;
string i2s[100001];
int n, m;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        cin >> i2s[i];
        s2i[i2s[i]] = i;
    }
    while (m--) {
        string s;
        cin >> s;
        if (isdigit(s[0])) {
            cout << i2s[stoi(s)] << '\n';
        } else {
            cout << s2i[s] << '\n';
        }
    }
}
