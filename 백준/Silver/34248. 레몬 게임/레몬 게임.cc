#include <iostream>
using namespace std;
int n, one, two, in;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> n;
    while (n--) {
        cin >> in;
        if (in == 2) two++;
        else one++;
    }
    if (two <= one && (two * 2 + one) % 3 == 0) cout << "Yes";
    else cout << "No";
}