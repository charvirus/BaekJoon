#include <algorithm>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string st = "SciComLove";
    int n, e = 10;
    cin >> n;
    n %= e;
    for (int i = n; i < e; i++) {
        cout<<st[i];
    }
    for (int i = 0;i<n;i++) {
        cout<<st[i];
    }
}
