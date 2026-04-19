#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int n, m, k, ans = 100000, cl = 1000000000;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m >> k;
    for (int i = 0; i < k; i++) {
        int y, x;
        cin >> y >> x;
        if (n - x + y - 1 < cl) {
            ans = i + 1;
            cl = n - x + y - 1;
        }
    }
    cout << ans;
}
