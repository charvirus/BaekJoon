#include <cmath>
#include <iostream>
using namespace std;
int y, c, p, cnt;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> y >> c >> p;
    c /= 2;
    cout<<min(y,min(c,p))<<endl;
}
