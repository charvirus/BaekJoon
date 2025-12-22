#include <cmath>
#include <iostream>
using namespace std;
int n;
string a, b, c;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> a >> b >> c;
    if (a == b || b == c || a == c) {
        cout << "Hmm...";
        return 0;
    }
    int p = 0, q = 0;
    while (a[p] == b[p])++p;
    while (b[q] == c[q])++q;
    cout<<(a[p] == c[q] && b[p] == b[q]?"Hmm...":"HJS! HJS! HJS!");
}