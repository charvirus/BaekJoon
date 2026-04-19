#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n = 0;

    cin >> n;
    long speed = 0, sum = 0, arr[n + 1];
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
    }
    for (int i = n; i >= 1; i--) {
        speed = min(arr[i], speed + 1);
        sum += speed;
    }
    cout << sum;
}
