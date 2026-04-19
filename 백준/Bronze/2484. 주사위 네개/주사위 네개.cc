#include <iostream>
#include <stack>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int mx = 0, n;
    cin >> n;
    while (n--) {
        int arr[7] = {0,};
        for (int i = 0; i < 4; i++) {
            int x;
            cin >> x;
            arr[x]++;
        }


        for (int i = 6; i > 0; i--) {
            if (arr[i] == 4) {
                mx = max(mx, 50000 + i * 5000);
                break;
            } else if (arr[i] == 3) {
                mx = max(mx, 10000 + i * 1000);
                break;
            } else if (arr[i] == 2) {
                for (int j = i - 1; j > 0; j--) {
                    if (arr[j] == 2) {
                        mx = max(2000 + i * 500 + j * 500, mx);
                        break;
                    } else {
                        mx = max(1000 + i * 100, mx);
                    }
                }
                break;
            } else if (arr[i] == 1) {
                mx = max(i * 100, mx);
            }
        }
    }
    cout << mx;
}
