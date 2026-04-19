#include <iostream>

using namespace std;
int arr[2][3];
int min_arr[2][3];
int max_arr[2][3];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, x, y, z, ans1, ans2, k = 0;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> x >> y >> z;
        max_arr[k][0] = max(max_arr[1 - k][0], max_arr[1 - k][1]) + x;
        max_arr[k][1] = max(max(max_arr[1 - k][0], max_arr[1 - k][1]), max_arr[1 - k][2]) + y;
        max_arr[k][2] = max(max_arr[1 - k][1], max_arr[1 - k][2]) + z;

        min_arr[k][0] = min(min_arr[1 - k][0], min_arr[1 - k][1]) + x;
        min_arr[k][1] = min(min(min_arr[1 - k][0], min_arr[1 - k][1]), min_arr[1 - k][2]) + y;
        min_arr[k][2] = min(min_arr[1 - k][1], min_arr[1 - k][2]) + z;
        k = 1 - k;
    }
    ans1 = max(max(max_arr[1 - k][0], max_arr[1 - k][1]), max_arr[1 - k][2]);
    ans2 = min(min(min_arr[1 - k][0], min_arr[1 - k][1]), min_arr[1 - k][2]);
    cout << ans1 << " " << ans2 << endl;
}
