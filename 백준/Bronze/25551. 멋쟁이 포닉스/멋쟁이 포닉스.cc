#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int mw, mb, tw, tb, pw, pb;
    cin >> mw >> mb >> tw >> tb >> pw >> pb;
    int x = min(min(mw, tb), pw);
    int y = min(min(mb, tw), pb);
    if (x == y) {
        cout << 2 * x;
    } else {
        cout << 2 * min(x, y) + 1;
    }
}
