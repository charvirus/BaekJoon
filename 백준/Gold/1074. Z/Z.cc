#include <iostream>
using namespace std;

int rec(int n, int r, int c) {
    if (n == 0) {
        return 0;
    }
    int half = 1 << (n - 1);
    if (r < half && c < half) {
        return rec(n - 1, r, c);
    }
    if (r < half && c >= half) {
        return half * half + rec(n - 1, r, c - half);
    }
    if (r >= half && c < half) {
        return 2 * half * half + rec(n - 1, r - half, c);
    }
    return 3 * half * half + rec(n - 1, r - half, c - half);
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, r, c;
    cin >> n >> r >> c;
    cout << rec(n, r, c);
}
