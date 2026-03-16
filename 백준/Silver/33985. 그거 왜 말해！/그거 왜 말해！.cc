#include <cmath>
#include <iostream>
using namespace std;

int n;
string t;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> t;
    if (t.front()=='A' && t.back()=='B') {
        cout<<"Yes";
    }else {
        cout<<"No";
    }
}
