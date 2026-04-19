#include <iostream>
using namespace std;

int d(string day) {
    if (day == "Mon")
        return 0;
    if (day == "Tue")
        return 24;
    if (day == "Wed")
        return 48;
    if (day == "Thu")
        return 72;
    if (day == "Fri")
        return 96;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, t, h1, h2;
    string d1, d2;
    cin >> t >> n;

    while (n--) {
        cin >> d1 >> h1 >> d2 >> h2;
        h1 += d(d1);
        h2 += d(d2);
        t -= (h2 - h1);
    }
    if (t>48) {
        cout << -1;
    } else {
        cout << max(t, 0);
    }
}
