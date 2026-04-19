#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int n, b = 0;
float cnt;
string s;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == 'S') {
            cnt++;
        } else {
            cnt += 0.5;
            b = 1;
        }
    }
    cout << int(cnt) + b;
}
