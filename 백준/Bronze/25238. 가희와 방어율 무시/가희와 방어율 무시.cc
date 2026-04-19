#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int a, b; cin >> a >> b;

    double redDef = a - a * (b / 100.0);
    if (redDef < 100) cout << 1 << "\n";
    else cout << 0 << "\n";

    return 0;
}
