#include <iostream>
using namespace std;
int a, b, k, x;
int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> a >> b >> k >> x;
    if (k - x > a) a = k - x;
    if (k + x < b) b = k + x;
    if (a <= b) {
        cout << b - a + 1;
    } else {
        cout << "IMPOSSIBLE";
    }
}