#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

vector<pair<int, int> > cd;

int n, k, x, y, cx, cy, nx, ny;
string cmd;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> k;
    for (int i = 0; i < n; i++) {
        cin >> x >> y;
        cd.emplace_back(x, y);
    }
    cin >> cmd;
    for (int i = 0; i < k; i++) {
        bool flag = false;
        nx = 0, ny = 0;
        char cc = cmd[i];
        if (cc == 'U') {
            ny++;
        } else if (cc == 'D') {
            ny--;
        } else if (cc == 'R') {
            nx++;
        } else {
            nx--;
        }

        for (int j = 0; j < n; j++) {
            if (cd[j].second == (cy + ny) && cd[j].first == (cx + nx)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            cx += nx;
            cy += ny;
        }
    }
    cout << cx << " " << cy;
}
