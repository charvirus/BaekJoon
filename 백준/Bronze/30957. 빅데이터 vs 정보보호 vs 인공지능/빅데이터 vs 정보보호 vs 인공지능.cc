#include <algorithm>
#include <iostream>
using namespace std;
int n, arr[3];
char ch[3] = {'B', 'S', 'A'};
string inp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> inp;

    for (int i = 0; i < n; i++) {
        if (inp[i] == 'B') {
            arr[0]++;
        } else if (inp[i] == 'S') {
            arr[1]++;
        } else if (inp[i]=='A'){
            arr[2]++;
        }
    }

    if (arr[0] == arr[1] && arr[1] == arr[2]) {
        cout << "SCU";
    } else {
        int mx = max(max(arr[0], arr[1]), arr[2]);
        for (int i = 0; i < 3; i++) {
            if (arr[i] == mx) {
                cout << ch[i];
            }
        }
    }
}
