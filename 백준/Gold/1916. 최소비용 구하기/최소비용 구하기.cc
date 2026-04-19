#include <iostream>
#include <queue>
#include <vector>

using namespace std;

vector<pair<int, int> > gph[1001];
int map[1001];

void dsk(int st) {
    fill(map, map + 1001, 2147483647);
    priority_queue<pair<int, int>, vector<pair<int, int> >, greater<pair<int, int> > > pq;
    pq.push(make_pair(0, st));
    map[st] = 0;

    while (!pq.empty()) {
        int curcost = pq.top().first;
        int x = pq.top().second;
        pq.pop();
        if (map[x] < curcost) continue;
        for (int i = 0; i < gph[x].size(); i++) {
            int nx = gph[x][i].first;
            int nxcost = curcost + gph[x][i].second;
            if (map[nx] > nxcost) {
                pq.push(make_pair(nxcost, nx));
                map[nx] = nxcost;
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, m, st, en;
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        gph[a].push_back(make_pair(b, c));
    }
    cin >> st >> en;
    dsk(st);
    cout << map[en];
}
