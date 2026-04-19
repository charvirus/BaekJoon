#include <algorithm>
#include <iostream>
#include <map>

using namespace std;

int n;
bool flag;
map<char, int> m;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;

    for (int i = 0; i < n; i++) {
        string inp;
        cin >> inp;
        m[inp[0]]++;
    }
    for (auto it = m.begin(); it != m.end(); it++) {
        if (it->second >= 5) {
            cout << it->first;
            flag = true;
        }
    }
    if (!flag) {
        cout<<"PREDAJA";
    }
}
