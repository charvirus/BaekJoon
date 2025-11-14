#include <cmath>
#include <cstring>
#include <iostream>
#include <vector>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, c;
    cin >> a >> b >> c;
    if (a + b + c >= 100) {
        cout << "OK";
    } else {
        if (a >c && b > c) {
            cout << "Hanyang";
        } else if (a < b && a < c) {
            cout << "Soongsil";
        } else {
            cout << "Korea";
        }
    }
}
