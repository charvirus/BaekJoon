#include <algorithm>
#include <string>
#include <iostream>
#include <map>
using namespace std;

int main() {
    int n, m,ans=0;
    int arr[15000];
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    int l = 0, r = n - 1;
    while (l < r) {
        if  (arr[l] + arr[r] == m) {
            ans++;
            l++;
            r--;
        }else if (arr[l] + arr[r] <m) {
            l++;
        }else {
            r--;
        }
    }
    cout << ans << '\n';
}
