#include <iostream>

using namespace std;


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int a, b, c, n,ans=0;
    cin >> a >> b >> c;
    cin >> n;
    int scores[n]={0,0};
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
            int aa, bb, cc;
            cin >> aa >> bb >> cc;
            scores[i] += (aa * a) + (bb * b) + (cc * c);
        }
        ans = max(ans, scores[i]);
    }
    cout << ans;
}
