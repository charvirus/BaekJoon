#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;
int n, arr[101], a, total;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> a;
    for (int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        a = abs(inp - a);
        total += min(a, 360 - a);
        a = inp;
    }
    cout << total;
}
