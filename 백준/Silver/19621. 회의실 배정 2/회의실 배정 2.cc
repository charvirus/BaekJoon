#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;
int N, s[26], e[26], n[26], result = 0;

void dp(int idx, int sum) {
    if (idx >= N) {
        result = max(result, sum);
        return;
    }
    dp(idx + 1, sum);
    dp(idx + 2, sum + n[idx]);
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> s[i] >> e[i] >> n[i];
    }

    dp(0, 0);
    cout<<result;
}
