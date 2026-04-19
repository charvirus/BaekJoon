#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t, n, c;
    cin >> t;
    while (t--) {
        cin >> n >> c;
        if (n%c) {
            cout<<n/c+1<<"\n";
        }
        else {
            cout<<n/c<<"\n";
        }
    }
}
