#include <algorithm>
#include <iostream>

using namespace std;
int arr[129][129] = {};
int wc = 0, bc = 0;

void div_conq(int y, int x, int st) {
    int tmp_cnt = 0;
    for (int i = y; i < y + st; i++) {
        for (int j = x; j < x + st; j++) {
            if (arr[i][j]) {
                tmp_cnt++;
            }
        }
    }
    if (tmp_cnt == 0) {
        wc++;
    } else if (tmp_cnt == st * st) {
        bc++;
    } else {
        div_conq(y, x, st / 2);
        div_conq(y + st / 2, x, st / 2);
        div_conq(y, x + st / 2, st / 2);
        div_conq(y + st / 2, x + st / 2, st / 2);
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> arr[i][j];
    div_conq(0, 0, n);
    cout << wc << '\n'<< bc << '\n';
    return 0;
}
