#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int n;
int main() {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> n;
    pair<double, int> p[100000];
    for (int i = 0; i < n; i++) {
        double X, Y, V;
        cin >> X >> Y >> V;
        p[i].first = sqrt(X * X + Y * Y)/V;
        p[i].second = i+1;
    }
    sort(p, p+n);
    for (int i = 0; i < n; i++) {
        cout << p[i].second << '\n';
    }
}
