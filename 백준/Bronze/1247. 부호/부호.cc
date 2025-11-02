#include <iostream>
#include <climits>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int n = 3, x;
    while (n--) {
        long long sum = 0, inp;
        int overflow = 0;
        cin >> x;
        for (int i = 0; i < x; i++) {
            cin >> inp;

            if (sum > 0 && inp > 0 && inp > LLONG_MAX - sum) {
                overflow++;
            } else if (sum < 0 && inp < 0 && inp < LLONG_MIN - sum) {
                overflow--;
            }

            sum += inp;
        }
        if (overflow != 0) {
            cout << (overflow > 0 ? "+" : "-") << "\n";
        } else if (sum == 0) {
            cout << "0\n";
        } else {
            cout << (sum > 0 ? "+" : "-") << "\n";
        }
    }
}
