#include <iostream>
using namespace std;

int n, a, b, c;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    if (n >= 300) {
        a = n / 300;
        n = n % 300;
    }
    if (n >= 60) {
        b = n / 60;
        n = n % 60;
    }
    if (n >= 10) {
        c = n / 10;
        n = n % 10;
    }

    if (n != 0) {
        cout << -1;
    } else {
        cout << a << " " << b << " " << c;
    }
}
