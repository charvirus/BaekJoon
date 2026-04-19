#include <algorithm>
#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n - 1; i++) {
        if (i < n - m) {
            cout << i << " " << i + 1;
        } else {
            cout << n - m << " " << i + 1;
        }
        cout << "\n";
    }
}
