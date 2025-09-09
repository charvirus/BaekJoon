#include <algorithm>
#include <cmath>
#include <iomanip>
#include <iostream>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n;
    cin >> n;
    double arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    cout<<fixed<<setprecision(3);
    for (int i = 0; i < 7; i++) {
        cout << arr[i] << "\n";
    }
}
