#include <iostream>
using namespace std;

int n, h, cnt = 0, inp;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> h;

    for (int i = 0; i < n; i++) {
        cin >> inp;
        h -= inp;
        if (h <= 0) {
            cout << i+1 << '\n';
            return 0;
        }
    }
    cout << -1 << '\n';
}
