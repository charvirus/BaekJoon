#include <algorithm>
#include <cstring>
#include <iostream>
using namespace std;
int n;
bool az[26];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    cin.ignore();
    while (n--) {
        bool flag = false;
        string inp;
        memset(az, false, sizeof(az));

        getline(cin, inp);
        for (int i = 0; i < inp.length(); i++) {
            if ('a' <= inp[i] && inp[i] <= 'z') {
                az[inp[i] - 'a'] = true;
            } else if ('A' <= inp[i] && inp[i] <= 'Z') {
                az[inp[i] - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!az[i]) {
                if (!flag) {
                    flag = true;
                    cout << "missing ";
                }
                cout << char('a' + i);
            }
        }
        if (!flag) {
            cout << "pangram";
        }
        cout << "\n";
    }
}
