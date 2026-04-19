#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a,b,c;
    cin >> a>>b>>c;
    if (a+b<(c*2)) {
        cout<<a+b;
    }else {
        cout<<a+b-(c*2);
    }
}
