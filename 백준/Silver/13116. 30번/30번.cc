#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t, a, b;
    cin >> t;
    while (t--) {
        cin >> a >> b;
        while (a != b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
        }
        cout << a * 10 << "\n";
    }
}
