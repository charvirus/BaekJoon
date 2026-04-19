#include <algorithm>
#include <iostream>
using namespace std;

int n, a, b, c;
bool chk[1000001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n--) {
        cin >> a >> b >> c;
        if (chk[a] || chk[b] || chk[c]) {
            cout << 1;
            return 0;
        }
        chk[a] = chk[b] = chk[c] = true;
    }
    cout << 0;
}