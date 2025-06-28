#include <iostream>
using namespace std;

int main() {
    int n, m, sum = 0, min = 0;
    cin >> m >> n;

    for (int i = 1; i * i <= n; i++) {
        if (i*i>=m) {
            sum += i*i;
            if (min == 0) {
                min = i*i;
            }
        }
    }
    if (sum == 0) {
        cout << "-1\n";
    }else {
        cout << sum<<"\n";
        cout << min<<"\n";
    }
    return 0;
}