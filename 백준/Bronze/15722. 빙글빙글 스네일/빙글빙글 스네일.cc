#include <iostream>
using namespace std;
int n, x, y, st = 0, cnt = 0;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> n;
    while (1) {
        st++;
        for (int i = 0; i < st; i++) {
            if (cnt == n) {
                cout << x << " " << y;
                return 0;
            }
            y++;
            cnt++;
        }
        for (int i = 0; i < st; i++) {
            if (cnt == n) {
                cout << x << " " << y;
                return 0;
            }
            x++;
            cnt++;
        }
        st++;
        for (int i = 0; i < st; i++) {
            if (cnt == n) {
                cout << x << " " << y;
                return 0;
            }
            y--;
            cnt++;
        }
        for (int i = 0; i < st; i++) {
            if (cnt == n) {
                cout << x << " " << y;
                return 0;
            }
            x--;
            cnt++;
        }
    }
}
