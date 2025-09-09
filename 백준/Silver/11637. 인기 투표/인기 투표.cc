#include <iostream>

using namespace std;


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, m;
    cin >> n;
    while (n--) {
        cin >> m;
        int nmax = 0, total = 0, idx = -1;
        bool flag = false;
        for (int i = 1; i <= m; i++) {
            int inp;
            cin >> inp;
            total += inp;
            if (inp == nmax) {
                flag = true;
            } else if (inp > nmax) {
                nmax = inp;
                idx = i;
                flag = false;
            }
        }
        if (flag) {
            cout << "no winner" << '\n';
        } else {
            total -= nmax;
            if (nmax > total) {
                cout << "majority winner " << idx << '\n';
            } else {
                cout << "minority winner " << idx << '\n';
            }
        }
        
    }
}
