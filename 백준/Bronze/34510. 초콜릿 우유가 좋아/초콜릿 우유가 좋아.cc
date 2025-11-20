#include <iostream>
using namespace std;
long long a, b, c, n;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> b >> c >> n;
    cout << (n % 2) * a + (n+1)/2 * b + c * n;
}
