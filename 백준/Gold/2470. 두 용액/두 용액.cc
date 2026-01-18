#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int n, x, s, e, resA, resB, mid;
vector<int> v;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x;
        v.push_back(x);
    }
    sort(v.begin(),v.end());
    s = 0;
    e = n - 1;
    mid = abs(v[s] + v[e]);
    resA = v[s];
    resB = v[e];
    while (s < e) {
        int temp = v[s] + v[e];
        if (abs(temp) < mid) {
            mid = abs(temp);
            resA = v[s];
            resB = v[e];
        }
        if (temp < 0) {
            s++;
        } else {
            e--;
        }
    }
    cout << resA << " " << resB;
}
