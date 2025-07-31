#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, x1=0, y1=0, z1=0, x2 = 1000, y2 = 1000, z2 = 1000, a, b, c, d, e, f, res = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a >> b >> c >> d >> e >> f;
        x1 = max(a, x1);
        y1 = max(b, y1);
        z1 = max(c, z1);
        x2 = min(d, x2);
        y2 = min(e, y2);
        z2 = min(f, z2);
    }
    int zz = (z2 - z1), yy = (y2 - y1), xx = (x2 - x1);
    res = xx * yy * zz;
    if  (zz<0||yy<0||xx<0) res  = 0;
    cout << res;
}
