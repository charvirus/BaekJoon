#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main(void) {
    int n, x, k;
    cin >> n >> x >> k;
    for (int i = 0; i < k; i++) {
        int a, b;
        cin >> a >> b;
        if (x == b) {
            x = a;
        } else if (x == a) {
            x = b;
        }
    }
    cout << x << endl;
}
