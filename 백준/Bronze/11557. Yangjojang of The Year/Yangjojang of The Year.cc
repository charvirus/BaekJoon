#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t;
    cin >> t;
    for (int i = 0; i < t; i++) {
        int n, l, mx = 0;
        string name, inp;
        cin >> n;

        for (int j = 0; j < n; j++) {
            cin >> inp >> l;
            if (mx < l) {
                name = inp;
                mx = l;
            }
        }
        cout << name<<"\n";
    }
}
