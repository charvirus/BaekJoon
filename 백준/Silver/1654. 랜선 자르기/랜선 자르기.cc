#include<iostream>
#include<string>
using namespace std;

int main() {
    unsigned int k, n, l = 1, r, mid,ans=0;
    cin >> k >> n;
    unsigned int arr[10000];
    for (int i = 0; i < k; i++) {
        cin >> arr[i];
        r = max(arr[i], r);
    }
    while (l <= r) {
        unsigned int quotient = 0;
        mid = (l + r) / 2;
        for (int i = 0; i < k; i++) {
            quotient += arr[i]/mid;
        }

        if (quotient >= n) {
            l = mid + 1;
            ans = max(ans, mid);
        }else {
            r = mid - 1;
        }
    }
    cout << ans << '\n';
}
