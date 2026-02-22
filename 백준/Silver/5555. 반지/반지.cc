#include <algorithm>
#include <iostream>
using namespace std;
string inp, x;
int cnt, n,len;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> inp >> n;
    len = inp.length();
    for (int i = 0; i < n; i++) {
        cin >> x;

        string temp = x+x;
        if (temp.find(inp) != string::npos) {
            cnt++;
        }
    }
    cout << cnt ;
}
