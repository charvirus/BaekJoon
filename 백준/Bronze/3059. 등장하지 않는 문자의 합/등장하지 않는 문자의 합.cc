#include <iostream>
using namespace std;
int t;
string s;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> t;

    for (int i = 0; i < t; i++) {
        bool alp [26] = {false,};
        int res = 2015;
        cin >> s;
        for (int j = 0;j<s.length();j++) {
            alp[s[j]-'A'] = true;
        }
        for (int j = 0;j<26;j++) {
            if (alp[j]) {
                res -= (j+65);
            }
        }
        cout << res << endl;
    }
}
