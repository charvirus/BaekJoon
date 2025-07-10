#include <algorithm>
#include <iostream>
using namespace std;

int n, sum = 0;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    for (int i =0; i < n; i++) {
        arr[i+1] += arr[i];
        sum += arr[i];
    }
    cout << sum << '\n';
}