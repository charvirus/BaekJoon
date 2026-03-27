#include <algorithm>
#include <iostream>
using namespace std;

int n;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (cin >> n) {
        if (n % 6) {
            cout << "N\n";
        } else {
            cout << "Y\n";
        }
    }
}
