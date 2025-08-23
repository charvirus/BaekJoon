#include <algorithm>
#include <iostream>

using namespace std;
#define mx 9
int n, m;
int arr[mx];
int num[mx];
bool vst[mx];

void dfs(int nm, int cnt) {
    if (cnt == m) {
        for (int i = 0; i < m; i++)
            cout << arr[i] << " ";
        cout << '\n';
    } else {
        for (int i = nm-1; i < n; i++) {
            vst[i] = true;
            arr[cnt] = num[i];
            dfs(i+1,cnt + 1);
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
    dfs(1, 0);
}
