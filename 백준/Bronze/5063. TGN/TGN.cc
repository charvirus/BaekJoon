#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int a, b, c;
        cin >> a >> b >> c;

        if (a == b - c) {
            cout << "does not matter" << '\n';
        }
        else if (a < b - c) {
            cout << "advertise" << '\n';
        }
        else {
            cout << "do not advertise" << '\n';
        }
    }
}