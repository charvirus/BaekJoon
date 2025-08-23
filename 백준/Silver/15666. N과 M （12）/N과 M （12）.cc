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
        int temp = 0;
        for (int i = nm; i < n; i++) {
            if (temp != num[i]) {
                arr[cnt] = num[i];
                temp = num[i];
                dfs(i,cnt + 1);
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        cin >> num[i];
    sort(num, num + n);
    dfs(0,0);
}
