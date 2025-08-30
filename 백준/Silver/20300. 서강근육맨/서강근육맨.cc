#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    int n;
    long mn = 0;
    cin >> n;
    long arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    if (n % 2) {
        mn = arr[n - 1];
        n--;
        for (int i = 0; i < n / 2; i++) {
            mn = max(mn, arr[i] + arr[n - 1 - i]);
        }
    } else {
        for (int i = 0; i < n / 2; i++) {
            mn = max(mn, arr[i] + arr[n - 1 - i]);
        }
    }
    cout << mn;
}
