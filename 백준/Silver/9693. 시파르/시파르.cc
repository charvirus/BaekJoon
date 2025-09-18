#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;
int x, c = 1;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> x;
    while (x) {
        int ans = 0;
        for (int i = 5; i <= x; i *= 5) {
            ans += x / i;
        }
        cout << "Case #" << c++ << ": " << ans << "\n";
        cin >> x;
    }
}
