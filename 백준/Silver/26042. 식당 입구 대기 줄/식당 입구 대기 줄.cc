#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, resl, resi = 100000;
queue<int> q;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;

    for (int i = 0; i < n; i++) {
        int inp, st;
        cin >> inp;
        if (inp == 1) {
            cin >> st;
            q.push(st);
            if (q.size() >= resl) {
                if (q.size() == resl) {
                    if (resi > st) {
                        resi = st;
                    }
                } else {
                        resl = q.size();
                        resi = st;
                    }
            }
        } else {
            q.pop();
        }
    }
    cout << resl << " " << resi;
}
