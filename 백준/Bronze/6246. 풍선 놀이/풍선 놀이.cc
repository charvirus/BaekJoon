#include <algorithm>
#include <iostream>
using namespace std;
bool chk[10001];
int n, q, l, i, cnt;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> q;
    for (int j = 0; j < q; j++) {
        cin >> l >> i;
        for (int k = l; k <= n; k += i) {
            chk[k] = true;
        }
    }
    for (int j = 1; j <= n; j++) {
        if (!chk[j]) {
            cnt++;
        }
    }
    cout << cnt;
}
