#include <algorithm>
#include <iostream>
using namespace std;
int m;
string inp, res, pre;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> m;
    while (m--) {
        cin >> inp;
        res += inp[0];
        pre = inp[0];
        for (int i = 1; i < inp.size(); i++) {
            if (inp[i] != inp[i - 1]) {
                res += inp[i];
            }
            pre = inp[i];
        }
        cout << res << "\n";
        res.clear();
    }
}
