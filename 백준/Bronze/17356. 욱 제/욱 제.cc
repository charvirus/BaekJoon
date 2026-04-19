#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cout << fixed;
    cout.precision(15);
    double a, b,m,ans;
    cin >> a >> b;
    m = (b-a)/400;
    ans = 1/(1+pow(10,m));
    cout << ans << endl;

}
