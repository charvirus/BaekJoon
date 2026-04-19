#include <algorithm>
#include <cstring>
#include <iostream>
#include <queue>
using namespace std;
bool vst[10000];
int a, b;

void bfs() {
    queue<pair<int, string> > q;
    q.push(make_pair(a, ""));
    vst[a] = true;
    while (!q.empty()) {
        int num = q.front().first;
        string str = q.front().second;
        if (num == b) {
            cout << str << endl;
            return;
        }
        q.pop();
        int D, S, L, R;
        D = (num * 2) % 10000;
        if (!vst[D]) {
            vst[D] = true;
            q.push(make_pair(D, str+'D'));
        }
        S = num-1;
        if (num == 0) {
            S = 9999;
        }
        if (!vst[S]) {
            vst[S] = true;
            q.push(make_pair(S, str+'S'));
        }
        L=(num*10)%10000+num/1000;
        if (!vst[L]) {
            vst[L] = true;
            q.push(make_pair(L, str+'L'));
        }
        R=num/10+(num%10)*1000;
        if (!vst[R]) {
            vst[R] = true;
            q.push(make_pair(R, str+'R'));
        }

    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    while (n--) {
        cin >> a >> b;
        bfs();
        memset(vst, false, sizeof(vst));
    }
}
