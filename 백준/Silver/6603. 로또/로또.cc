#include <algorithm>
#include <cstring>
#include <iostream>
using namespace std;

int k, s, inp, arr[13] = {0,}, num[13] = {0,};
bool vst[13] = {false,};

void dfs(int cnt, int start) {
    if (cnt == 6) {
        for (int i = 0; i < 6; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }
    for (int i = start; i < k; i++) {
        if (!vst[i]) {
            vst[i] = true;
            arr[cnt] = num[i];
            dfs(cnt + 1, i + 1);
            vst[i] = false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (true) {
        cin >> k;
        if (k == 0) break;
        for (int i = 0; i < k; i++) {
            cin >> num[i];
        }
        dfs(0, 0);
        memset(num, 0, 13);
        memset(vst, false, 13);
        cout << "\n";
    }
}
