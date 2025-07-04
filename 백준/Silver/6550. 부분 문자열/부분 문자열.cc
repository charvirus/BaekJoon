#include <iostream>

using namespace std;

int main() {
    string a, b;
    while (cin >> a >> b) {
        bool flag = false;
        int idx = 0;
        for (int i = 0; i < b.length(); i++) {
            if (a[idx] == b[i]) {
                idx++;
            }
            if (idx == a.length()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            cout << "Yes" << '\n';
        } else {
            cout << "No" << '\n';
        }
    }
}
