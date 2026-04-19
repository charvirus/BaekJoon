#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n,cnt=0,x=0;
    string s;
    cin >> n;
    cin >> s;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'C') {cnt++;}
    }
    cout << ceil(n/(n-cnt+1));
}
