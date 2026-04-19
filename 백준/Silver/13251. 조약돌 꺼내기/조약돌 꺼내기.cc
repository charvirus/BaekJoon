#include <algorithm>
#include <iostream>
using namespace std;
int m, k, arr[51], total;
double res;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> arr[i];
        total += arr[i];
    }
    cin >> k;
    for (int i = 0; i < m; i++) {
        double temp = 1.0;
        if (k > arr[i]) { continue; }
        for (int j = 0; j < k; j++) {
            temp *= (double) (arr[i] - j) / (total - j);
        }
        res += temp;
    }
    cout << fixed;
    cout.precision(15);
    cout << res;
}
