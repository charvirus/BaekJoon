#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, sum, d;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> d;
        sum += d;
    }
    if (sum % 2 == 0 || (n > 1)) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}
