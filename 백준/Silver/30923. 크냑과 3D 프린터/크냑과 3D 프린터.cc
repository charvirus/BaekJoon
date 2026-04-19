#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int n, h,ph=0;
    long sz = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> h;
        sz += abs(h-ph);
        sz += h*2;
        sz += 2;
        ph = h;
    }

    sz += ph;
    cout<<sz;

}