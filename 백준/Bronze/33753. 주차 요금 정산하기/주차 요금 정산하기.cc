#include <iostream>
#include <cmath>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, c, sm = 0;
    float t;
    cin >> a >> b >> c >> t;
    if (t >= 30) {
        sm += a;
        sm += c * ceil((t - 30) / b);
        cout << sm;
    } else {
        cout << a;
    }
}
