#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {
        int st = i, en, sum = 0;
        bool flag = false;
        for (int j = i; j < n; j++) {
            sum += arr[j];
            if (sum == 3) {
                en = j;
                flag = true;
                break;
            } else if (sum > 3) {
                break;
            }
        }
        if (flag) {
            for (int j = st; j <= en; j++) {
                arr[j] = 0;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        int st = i, en, sum = 0;
        bool flag = false;
        for (int j = i; j < n; j++) {
            sum += arr[j];
            if (sum == 3) {
                en = j;
                flag = true;
                break;
            } else if (sum > 3) {
                break;
            }
        }
        if (flag) {
            for (int j = st; j <= en; j++) {
                arr[j] = 0;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        if (arr[i] == 1 || arr[i] == 2) {
            cout << "No";
            return 0;
        }
    }
    cout << "Yes";
}
