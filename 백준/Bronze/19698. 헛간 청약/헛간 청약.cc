#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, w, h, l;
    cin >> n >> w >> h >> l;
    if (n>(w/l) * (h/l)){
        cout<<(w/l) * (h/l);
    }else {
        cout<<n;
    }
}
