#include <cmath>
#include <iostream>
using namespace std;
int n, k, cnt, idx;
int card[1001];
bool vst[1001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> k;
    for (int i = 0; i < n * k; i++) {
        cin >> card[i];
    }

    while (cnt != n * k - 1) {
        int move = card[idx];
        cnt++;
        vst[idx] = true;
        for (int i = 1; i <= move; i++) {
            if (vst[(idx + i) % (n * k)])move++;
        }
        idx = (idx + move) % (n * k);
    }
    cout<<(idx)/k+1<<" "<<card[idx];
}
