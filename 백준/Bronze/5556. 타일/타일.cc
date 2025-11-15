#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b;
    cin >> a >> b;
    while (b--) {
        int x, y;
        cin >> x >> y;
        cout << (min(min(x, a-x + 1), min(y, a - y + 1))-1) % 3 + 1 << "\n";
    }
}
