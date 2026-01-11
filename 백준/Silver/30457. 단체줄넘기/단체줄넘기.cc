#include <algorithm>
#include <iostream>
using namespace std;

int n, x, ans, arr[1001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> x;
        arr[x]++;
    }
    for (int i = 1; i < 1001; i++) {
        ans += min(arr[i],2);
    }
    cout<<ans;
}
