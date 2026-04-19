#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (1) {
        vector<int> v;
        int n,t,pi=0;
        cin >> n;
        if (n == 0) {
            break;
        }
        for (int i = 0; i < n; i++) {
            cin >> t;
            if (pi!=t) {
                v.push_back(t);
            }
            pi = t;
        }
        for (auto i : v) {
            cout << i << " ";
        }
        cout << "$\n";
    }
}
