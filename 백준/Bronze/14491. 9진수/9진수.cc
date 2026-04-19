#include <algorithm>
#include <iostream>
using namespace std;
int n;
string s;
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n) {
        s += to_string(n%9);
        n /= 9;
    }
    reverse(s.begin(),s.end());
    cout<<s;
}
