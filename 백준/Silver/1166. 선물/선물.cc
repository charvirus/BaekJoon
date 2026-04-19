#include <algorithm>
#include <iostream>

using namespace std;
int n, l, w, h;

bool check(long double mid) {
    long long  ml = l / mid;
    long long  mw = w / mid;
    long long mh = h / mid;

    long long size = ml * mw * mh;
    
    if (n <= size) return true;
    return false;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> l >> w >> h;

    long double s = 0;
    long double mn = min(h, min(l, w));
    int cnt = 150;
    while (s <= mn && cnt--) {
        long double mid = (s + mn) / 2;
        if (check(mid)) {
            s = mid;
        }else {
            mn = mid;
        }
    }
    cout.precision(30);
    cout << s << endl;
}
