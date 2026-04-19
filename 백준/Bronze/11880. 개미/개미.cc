#include <iostream>
#include <cmath>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    long long a, b, c, sum=0,mx=0;
    int t;
    cin >>t;
    while (t--) {
        cin >> a >> b >> c;
        mx = max(max(a, b), c);

        if (mx == a) {
            sum = b + c;
        }
        else if (mx == b) {
            sum = a + c;
        }
        else {
            sum = a + b;
        }

        cout << mx * mx + sum * sum << "\n";
    }
}