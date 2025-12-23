#include <cmath>
#include <iostream>
using namespace std;
int n;
string a, b, c;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int aa,bb,dp;
    cin >> aa >> bb;
    dp = 10+2*(25-aa+bb);
    if (dp<=0) {
        cout<<0;
    }else {
        cout<<dp;
    }
}