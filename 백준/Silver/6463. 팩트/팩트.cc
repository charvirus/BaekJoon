#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a;
    while (cin >> a) {
        long fact = 1;
        for (int i = 1; i <= a; ++i) {
            fact *= i;
            while (fact % 10==0) {
                fact /= 10;
            }
            fact %= 1000000000;
        }
        cout.width(5);
        cout << a << " -> " << (fact % 10) << "\n";
    }
}
