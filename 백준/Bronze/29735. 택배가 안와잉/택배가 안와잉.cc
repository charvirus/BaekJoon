#include <iostream>
using namespace std;


void add(int h, int m, int plus) {
    m += plus;
    if (m >= 60) {
        h += m / 60;
        m %= 60;
    }
    h %= 24;
    if (h < 10) cout << 0;
    cout << h << ':';
    if (m < 10) cout << 0;
    cout << m;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int starth, startm, endh, endm, n, t;
    char c;
    cin >> starth >> c >> startm >> endh >> c >> endm;
    int gap = (endh - starth) * 60 + endm - startm;
    cin >> n >> t;

    int day = (gap - 1) / t;
    cout << n / day << "\n";
    add(starth, startm, (n % day + 1) * t);
}
