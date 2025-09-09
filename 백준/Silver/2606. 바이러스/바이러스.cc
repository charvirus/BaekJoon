#include <cstdio>
#include <vector>
#define endl "\n"
using namespace std;
vector<int> map[101];
bool vst[101];
int c, p, cnt = 0;
void DFS(int v) {
    vst[v] = true;
    for (int i = 0; i < map[v].size(); i++) {
        int w = map[v][i];
        if (!vst[w]) {
            cnt++;
            DFS(w);
        }
    }
}
int main() {
    scanf("%d%d", &c, &p);
    for (int i = 0; i < p; i++) {
        int s, e;
        scanf("%d%d",&s,&e);
        map[s].push_back(e);
        map[e].push_back(s);
    }
    DFS(1);
    printf("%d", cnt);
}