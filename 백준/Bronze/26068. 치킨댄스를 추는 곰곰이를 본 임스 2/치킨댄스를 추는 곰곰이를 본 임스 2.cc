#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;
int n, ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n--) {
        string inp;
        cin >> inp;
        int day = stoi(inp.substr(2));
        if (day <= 90) {
            ans++;
        }
    }
    cout << ans;
}
