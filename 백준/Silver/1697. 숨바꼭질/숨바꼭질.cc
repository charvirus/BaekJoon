#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;
int n, k;
queue<pair<int, int> > q;
bool vst[100001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> k;
    q.push({n, 0});
    vst[n] = true;
    while (!q.empty()) {
        int x = q.front().first;
        int cnt = q.front().second;
        q.pop();
        if (x == k) {
            cout << cnt << endl;
            break;
        }
        if (0<=x-1&&x - 1 < 100001 && !vst[x - 1]) {
            vst[x - 1] = true;
            q.push({x - 1, cnt + 1});
        }
        if (x + 1 < 100001 && !vst[x + 1]) {
            vst[x + 1] = true;
            q.push({x + 1, cnt + 1});
        }
        if (x * 2 < 100001 && !vst[x * 2]) {
            vst[x * 2] = true;
            q.push({x * 2, cnt + 1});
        }
    }
}
