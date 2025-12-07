#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string st = "";
    int ans = 0;
    long n;
    cin >> n;
    while (n != 0) {
        if (n % 2) st += "1";
        else st += "0";
        n /= 2;
    }
    int l = st.length();
    for (int i = 0; i < st.length(); i++) {
        ans += pow(2, i) * (st[l-i-1]-'0');
    }
    cout << ans;
}
