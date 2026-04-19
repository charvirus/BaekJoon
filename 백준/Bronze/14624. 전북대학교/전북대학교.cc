#include <cstring>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    if (n % 2 && n >= 3) {
        for (int i = 0; i < n; i++) {
            cout << "*";
        }
        cout << "\n";
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 0; j < (n / 2 + 1) - i; j++) {
                cout << " ";
            }
            cout << "*";
            for (int j = 1; j < (i * 2) - 2; j++) {
                cout << " ";
            }
            if (i != 1) {
                cout << "*";
            }
            cout << "\n";
        }
    } else {
        cout << "I LOVE CBNU";
    }
}
