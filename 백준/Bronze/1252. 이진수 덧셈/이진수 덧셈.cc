#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string a, b;
    cin >> a >> b;
    if (a.length() < b.length()) swap(a, b);
    while (a.length() != b.length()) b = '0' + b;
    string temp = "";
    bool flag = 0;
    for (int i = a.length() - 1; i > -1; i--) {
        int t1 = a[i] == '1' ? 1 : 0;
        int t2 = b[i] == '1' ? 1 : 0;

        if (t1 + t2 + flag == 3) {
            temp = '1' + temp;
        } else if (t1 + t2 + flag == 2) {
            flag = 1;
            temp = '0' + temp;
        } else if (t1 + t2 + flag == 1) {
            flag = 0;
            temp = '1' + temp;
        } else if (t1 + t2 + flag == 0) {
            flag = 0;
            temp = '0' + temp;
        }
    }
    if (flag)temp = '1' + temp;
    string ans = "";
    flag = false;
    for (int i = 0; i < temp.length(); i++)
    {
        if (temp[i] != '0') flag = true;

        if (flag) ans += temp[i];
    }
    if (flag) cout << ans;
    else cout << 0;
}
