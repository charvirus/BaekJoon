#include <algorithm>
#include <iostream>
using namespace std;
int arr[50] = {0,};

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        arr[x]++;
    }
    for (int i = n; i >= 0; i--) {
        if (arr[i] == i) {
            cout << i;
            return 0;
        }
    }
    cout << -1;
}
