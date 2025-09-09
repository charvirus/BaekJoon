#include <algorithm>
#include <iostream>

using namespace std;

int n, m;
int arr[10] = {0,};
int num[10] = {0,};
bool vst[10] = {false,};

void dfs(int cnt) {
    if (cnt == m) {
        for (int i = 0; i < m; i++)
            cout << arr[i] << " ";
        cout << '\n';
    } else {
        for (int i = 0; i < n; i++) {
            vst[i] = true;
            arr[cnt] = num[i];
            dfs(cnt + 1);
            vst[i] = false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        cin >> num[i];
    sort(num, num + n);
    dfs(0);
}
