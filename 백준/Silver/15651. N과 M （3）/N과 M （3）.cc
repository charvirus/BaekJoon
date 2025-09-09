#include <algorithm>
#include <iostream>

using namespace std;

int n, m;
int arr[9] = {0,};
bool vst[9] = {false,};

void dfs(int cnt) {
    if (cnt == m) {
        for (int i = 0; i < m; i++) {
            cout << arr[i] << " ";
        }
        cout << '\n';
        return;
    }
    for (int i = 1; i <= n; i++) {
        vst[i] = true;
        arr[cnt] = i;
        dfs(cnt + 1);
        vst[i] = false;
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    dfs(0);
}
