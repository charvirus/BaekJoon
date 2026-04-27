#include <algorithm>
#include <cmath>
#include <iostream>
#include <queue>
#include <vector>
using namespace std;

vector<vector<int> > map;
vector<pair<int, int> > virus;
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

int n, m, ans;

int bfs(vector<vector<int> > map) {
    queue<pair<int, int> > q;
    int result = 0;
    for (int i = 0; i < virus.size(); ++i) {
        q.emplace(virus[i].first, virus[i].second);
        while (!q.empty()) {
            int cx = q.front().first;
            int cy = q.front().second;
            q.pop();
            for (int j = 0; j < 4; ++j) {
                int nx = cx + dx[j];
                int ny = cy + dy[j];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && map[nx][ny] == 0) {
                    q.emplace(nx, ny);
                    map[nx][ny] = 2;
                }
            }
        }
    }
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            if (map[i][j] == 0) {
                result++;
            }
        }
    }
    return max(ans, result);
}

void wall(int idx, vector<vector<int> > map) {
    if (idx == 4) {
        ans = bfs(map);
    } else {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    wall(idx + 1, map);
                    map[i][j] = 0;
                }
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    map.assign(n + 1, vector<int>(m + 1, 0));
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            cin >> map[i][j];
            if (map[i][j] == 2) {
                virus.emplace_back(i, j);
            }
        }
    }

    wall(1, map);
    cout << ans;
}
