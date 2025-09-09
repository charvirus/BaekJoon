#include <algorithm>
#include <iostream>
using namespace std;


int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m,ans=0;
    string s;
    cin >> n;
    cin >> m;
    cin >> s;
    for (int i = 0; i < m; i++) {
        int k = 0;
        if (s[i]=='O') {
            continue;
        }else {
            while (s[i+1]=='O'&&s[i+2]=='I') {
                k++;
                if (k==n) {
                    k--;
                    ans++;
                }
                i+=2;
            }
            k=0;
        }
    }
    cout << ans;
}
