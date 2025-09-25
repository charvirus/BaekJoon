#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a;
    while (cin >> a) {
        long fact = 1;
        for (int i = 1; i <= a; ++i) {
            long mul = i;
            while (mul % 5 == 0) {
                mul /= 5;
                fact /= 2;
            }
            fact = (fact%100000)*mul;
        }
        cout.width(5);
        cout << a << " -> " << (fact % 10) << "\n";
    }
}
