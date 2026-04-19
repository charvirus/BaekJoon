#include <cmath>
#include <iostream>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int a, b, x, y;
    cin >> a >> b >> x >> y;

    if ((a == 0 || b == 0) && ((x == 0 &&y<b )|| (y==0 && x<a))) {
        cout << 3 << '\n';
    }else if (a== 0 || b == 0) {
        cout << 1 << '\n';
    }else {
        cout << 2 << '\n';
    }
}
