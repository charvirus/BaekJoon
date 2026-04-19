#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m, k;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> m>>k;
        cout<<k-m+2<<"\n";
    }

}
