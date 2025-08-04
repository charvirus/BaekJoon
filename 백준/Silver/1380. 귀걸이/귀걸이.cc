#include <algorithm>
#include <iostream>
#include <string>
#include <vector>

using namespace std;


int main(void) {
    int n, scn = 1;
    while (true) {
        cin >> n;
        if (n == 0) {
            break;
        }
        vector<string> v(n);
        vector<bool> b(n, false);
        for (int i = 0; i < n; i++) {
            cin >> ws;
            getline(cin, v[i]);
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            int num;
            char a;
            cin >> num >> a;
            if (!b[num - 1]) {
                b[num - 1] = true;
            } else {
                b[num - 1] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i]) {
                cout << scn << " " << v[i] << '\n';
            }
        }
        scn++;
    }
}
