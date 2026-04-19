#include <algorithm>
#include <cstring>
#include <iostream>

using namespace std;
int n, cnt,v[11];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    memset(v, -1, sizeof(v));
    cin >> n;
    while (n--) {
        int c, s;
        cin >> c >> s;
        if (v[c] != -1 && v[c] != s) cnt++;
        v[c] = s;
    }
    cout << cnt;
}
