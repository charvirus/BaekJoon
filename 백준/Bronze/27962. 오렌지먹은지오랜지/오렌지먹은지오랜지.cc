#include <algorithm>
#include <iostream>
using namespace std;

int n;
string s;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> s;
    for (int i = 1; i <= n; i++) {
        string a = s.substr(0, i);
        string b = s.substr(n - i, i);
        int cnt = 0;
        for (int j = 0; j < i; j++) {
            if (a[j] != b[j]) cnt++;
        }
        if (cnt == 1) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}
