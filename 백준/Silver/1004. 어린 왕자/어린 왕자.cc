#include <iostream>
#include <cmath>
using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int T, x1, y1, x2, y2, cx, cy, r, n;
    cin >> T;
    while (T--) {
        int cnt = 0;
        cin >> x1 >> y1 >> x2 >> y2;
        cin >> n;
        while (n--) {
            cin >> cx >> cy >> r;
            // 출발 지점이 원 안이냐
            bool start = sqrt(pow(cx - x1, 2) + pow(cy - y1, 2)) <= r;
            // 도착 지점이 원 안이냐
            bool end = sqrt(pow(cx - x2, 2) + pow(cy - y2, 2)) <= r;

            if (start != end)
                cnt++;
        }

        cout << cnt << "\n";
    }
}
