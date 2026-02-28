#include <algorithm>
#include <iostream>
using namespace std;
long x, y, p, a, b, ans;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> x >> y >> p >> a >> b;
    p += b * (y - 1);
    ans += x * p - (x*(x-1)*a)/2;
    cout << ans;
}
