#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, cm, y, ssu, ssa, f, b, gs, gc, w, a;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n--) {
        cin >> cm >> y >> ssu >> ssa >> f >> b >> gs >> gc >> w;
        int pancake = min(cm / 0.5, min(y / 0.5, min(ssu / 0.25, min(ssa / 0.0625, f / 0.5625))));

        int cake = b + gs / 30 + gc / 25 + w / 10;

        cout << min(pancake, cake) << "\n";
    }
}
