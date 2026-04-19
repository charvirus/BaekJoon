#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, lcnt, ucnt;
bool l[26], u[26];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        char c;
        cin >> c;
        if (isupper(c)) {
            if (!u[c - 'A'] && c == 'R') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'O') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'Y') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'G') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'B') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'I') {
                ucnt++;
            }
            if (!u[c - 'A'] && c == 'V') {
                ucnt++;
            }
            u[c - 'A'] = 1;
        } else {
            if (!l[c - 'a'] && c == 'r') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'o') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'y') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'g') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'b') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'i') {
                lcnt++;
            }
            if (!l[c - 'a'] && c == 'v') {
                lcnt++;
            }
            l[c - 'a'] = 1;
        }
    }

    if (lcnt == 7 && ucnt == 7) {
        cout << "YeS";
    } else if (lcnt == 7) {
        cout << "yes";
    } else if (ucnt == 7) {
        cout << "YES";
    } else {
        cout << "NO!";
    }
}
