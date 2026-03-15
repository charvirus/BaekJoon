#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int n, m, k, pn;
float ans, ps;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m >> k;
    vector<float> vec(n, 0.0);
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> pn >> ps;
            vec[pn-1] = max(ps,vec[pn-1]);
        }
    }
    sort(vec.begin(),vec.end(),greater<float>());
    for (int i = 0;i<k;i++) {
        ans+= vec[i];
    }
    cout << fixed;
    cout.precision(1);
    cout << ans;
}
