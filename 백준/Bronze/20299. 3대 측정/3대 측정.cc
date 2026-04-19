#include <algorithm>
#include <iostream>

using namespace std;
int n, k, l,cnt;
string s;
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> k >> l;
    for (int i = 0; i < n; i++) {
        int x1, x2, x3;
        cin >> x1 >> x2 >> x3;
        if (x1 + x2 + x3 >= k && x1 >= l && x2 >= l && x3 >= l) {
            cnt++;
            s += to_string(x1) + " " + to_string(x2) + " " + to_string(x3)+" ";
        }
    }
    cout << cnt << "\n"<<s;
}
