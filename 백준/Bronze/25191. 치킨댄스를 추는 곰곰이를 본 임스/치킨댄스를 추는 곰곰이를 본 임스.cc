#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;
int n, a, b;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> a >> b;
    if (n > a/2+b) {
        cout<<a/2+b;
    }else {
        cout<<n;
    }
}
