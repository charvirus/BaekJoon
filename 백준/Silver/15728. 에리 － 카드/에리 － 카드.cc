#include <iostream>

using namespace std;
int shared[100], team[100];
bool vst[100];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, k;
    cin >> n >> k;

    for (int i = 0; i < n; i++)
        cin >> shared[i];
    for (int i = 0; i < n; i++)
        cin >> team[i];
    int ans, pos;
    for (int i = -1; i < k; i++) {
        ans = -1000000007, pos = -1;
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < n; l++) {
                if (vst[l])
                    continue;
                if (shared[j] * team[l] > ans) {
                    ans = shared[j] * team[l];
                    pos = l;
                }
            }
        }
        vst[pos] = true;
    }
    cout << ans;
}
