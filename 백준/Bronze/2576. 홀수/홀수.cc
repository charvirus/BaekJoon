#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int mn = 100, sum = 0;
    bool flag = false;

    for (int i = 0; i < 7; i++) {
        int n;
        cin >> n;
        if (n % 2 == 1) {
            flag = true;
            sum += n;
            mn = min(mn, n);
        }
    }
    if (flag) {
        cout << sum << "\n" << mn;
    }
    else {
        cout<<-1;
    }
}
