#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    long long left[100002] = {0,}, right[100002] = {0,}, crossN = 0, dis = 1e18;
    int cross[100002] = {0,};

    for (int i = 0; i < n; i++) {
        cin >> cross[i];
    }
    for (int i = 1; i < n; i++) {
        cin >> left[i];
        left[i] += left[i - 1];
    }
    for (int i = 1; i < n; i++) {
        cin >> right[i];
        right[i] += right[i - 1];
    }

    for (int i = 0; i < n; i++) {
        long long temp = left[i] + cross[i] + right[n - 1] - right[i];
        if (dis > temp) {
            crossN = i;
            dis = temp;
        }
    }


    cout << crossN + 1 << " " << dis;
}
