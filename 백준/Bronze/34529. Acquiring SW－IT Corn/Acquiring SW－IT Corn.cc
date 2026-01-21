#include <iostream>
using namespace std;
int x, y, z, u, v, w,sum;
int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> x >> y >> z >> u >> v >> w;
    sum = (x*u/100) + (y*v/50) + (z*w/20);
    cout << sum ;
}