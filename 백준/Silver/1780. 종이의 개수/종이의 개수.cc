#include <algorithm>
#include <iostream>

using namespace std;
int arr[2200][2200] = {};
int m = 0, z = 0, p = 0;

void dnc(int y, int x, int n) {
    bool flag = true;
    for (int i = y; i < y + n; i++) {
        for (int j = x; j < x + n; j++) {
            if (arr[i][j] != arr[y][x]) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            break;
        }
    }
    if (!flag) {
        dnc(y, x, n / 3);
        dnc(y, x + n / 3, n / 3);
        dnc(y, x + (n / 3) * 2, n / 3);

        dnc(y + n / 3, x, n / 3);
        dnc(y + n / 3, x + n / 3, n / 3);
        dnc(y + n / 3, x + (n / 3) * 2, n / 3);

        dnc(y + (n / 3) * 2, x, n / 3);
        dnc(y + (n / 3) * 2, x + n / 3, n / 3);
        dnc(y + (n / 3) * 2, x + (n / 3) * 2, n / 3);
    }else {
        if (arr[y][x] == -1) {
            m++;
        }else if (arr[y][x] == 0) {
            z++;
        }else{
            p++;
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> arr[i][j];
    dnc(0, 0, n);
    cout << m << '\n' << z << '\n' << p<< '\n';
}
