#include <cmath>
#include <iostream>
using namespace std;
int a, b, c, sum, arr[101];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> b >> c;
    for (int i = 0; i < 3; i++) {
        int x, y;
        cin >> x >> y;
        for (int j = x; j < y; j++) {
            arr[j]++;
        }
    }
    for (int i = 1; i < 101; i++) {
        if (arr[i] == 1) {
            sum += a * arr[i];
        } else if (arr[i] == 2) {
            sum += b * arr[i];
        } else if (arr[i] == 3) {
            sum += c * arr[i];
        }
    }
    cout << sum;
}
