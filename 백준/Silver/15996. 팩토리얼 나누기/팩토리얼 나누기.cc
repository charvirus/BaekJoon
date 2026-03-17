#include <cmath>
#include <iostream>
using namespace std;

long n, a, ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> a;
    for (long i = a; i <= n; i *= a) {
        ans += n / i;
    }
    cout << ans;
}
