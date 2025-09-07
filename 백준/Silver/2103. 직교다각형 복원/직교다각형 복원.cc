#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;
int shared[100], team[100];
bool vst[100];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, ans = 0;
    cin >> n;
    vector<vector<int> > vX(10001);
    vector<vector<int> > vY(10001);
    for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;
        vX[x].push_back(y);
        vY[y].push_back(x);
    }
    for (int i = 0; i < 10001; i++) {
        sort(vX[i].begin(), vX[i].end());
        sort(vY[i].begin(), vY[i].end());
        for (int j = 0; j < vX[i].size(); j += 2)
            ans += vX[i][j + 1] - vX[i][j];
        for (int j = 0; j < vY[i].size(); j += 2)
            ans += vY[i][j + 1] - vY[i][j];
    }

    cout << ans;
}
