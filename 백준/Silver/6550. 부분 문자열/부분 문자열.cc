#include <iostream>

using namespace std;

int main() {
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(false);
    string a, b;
    while (cin >> a >> b) {
        int idx = 0;
        for (int i = 0; i < b.length(); i++) {
            if (a[idx] == b[i]) {
                idx++;
            }
        }
        if (idx == a.length()) {
            cout << "Yes" << '\n';
        } else {
            cout << "No" << '\n';
        }
    }
}
