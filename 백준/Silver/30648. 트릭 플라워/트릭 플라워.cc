#include <iostream>
#include <vector>
using namespace std;


int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, r, time=0;
    cin >> a >> b;
    cin >> r;
    vector<vector<bool>> map(r, vector<bool>(r));
    map[a][b] = true;
    while (true) {
        ++time;
        if (a + b + 2 < r) {
            a++;
            b++;
        } else {
            a >>= 1;
            b >>= 1;
        }
        if (map[a][b] == true) {
            cout << time<<'\n';
            return 0;
        }
        map[a][b] = true;
    }
}
