#include <iostream>
using namespace std;
int a, k, cnt;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> k;
    int arr[a];
    for (int i = 0; i < a; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < a - 1; i++) {
        for (int j = 0; j < a - 1; j++) {

            if (arr[j + 1] < arr[j]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                cnt++;
            }
            if (cnt == k) {
                cout << arr[j] << " " << arr[j + 1];
                return 0;
            }
        }
    }
    cout << -1;
}