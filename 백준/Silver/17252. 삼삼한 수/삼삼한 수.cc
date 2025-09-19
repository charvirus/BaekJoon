#include <cmath>
#include <cstdint>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int n;
    cin >> n;
    if (n == 0 || n == 2) {
        cout << "NO";
        return 0;
    }
    while (n / 3) {
        if (n % 3 == 2) {
            cout << "NO";
            return 0;
        }
        n /= 3;
    }
    if (n % 3 != 2) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}
