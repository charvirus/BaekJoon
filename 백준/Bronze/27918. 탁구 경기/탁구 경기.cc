#include <iostream>
using namespace std;
int n, d, p;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        char inp;
        cin >> inp;
        if (inp == 'D') {
            d++;
        } else {
            p++;
        }
        if (abs(d - p) >= 2) {
            break;
        }
    }
    cout << d << ":" << p;
}
