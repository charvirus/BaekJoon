#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m, j, bskl, bskr,ans=0;
    cin >> n >> m >> j;
    bskl = 1;
    bskr = m;
    vector<bool> apple(j, false);
    for (int i = 0; i < j; i++) {
        int a;
        cin >> a;
        apple[a - 1] = true;
        while (apple[a - 1]) {
            if (bskl <= a && a <= bskr) {
                apple[a - 1] = false;
            } else {
                if (a < bskl) {
                    bskl--;
                    bskr--;
                    ans++;
                }else {
                    bskl++;
                    bskr++;
                    ans++;
                }
            }
        }
    }
    cout << ans << "\n";
}
