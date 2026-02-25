#include <algorithm>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    long long h, s;
    cin >> h >> s;
    if (h <= 2) {
        cout << 1;
    } else {
        h += s*(h>=5 ? 3:2);
        cout<<(h+1)/2;
    }
}
