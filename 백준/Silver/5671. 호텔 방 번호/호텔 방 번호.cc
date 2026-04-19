#include <algorithm>
#include <iostream>
using namespace std;

int n,m;

bool check(string inp) {
    bool chk[10] ={0,};
    for (int i = 0;i<inp.length();i++) {
        if (!chk[inp[i]-'0']) {
            chk[inp[i]-'0'] = true;
        }else {
            return false;
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (cin >> n>>m) {
        int ans = 0;
        for (int i = n;i<=m;i++) {
            string idx = to_string(i);
            if (check(idx)) {
                ans ++;
            }
        }
        cout<<ans<<"\n";
    }
}
