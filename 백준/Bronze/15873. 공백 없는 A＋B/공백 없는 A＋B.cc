#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int a = 0, b;
    cin >> b;
    if (b == 1010) {
        cout << 20;
    } else if (b % 10 == 0) {
        b /= 100;
        cout << b + 10;
    } else {
        a += b % 10;
        b /= 10;
        if (b == 10) {
            cout << 10 + a;
        } else {
            cout << a + b;
        }
    }
}