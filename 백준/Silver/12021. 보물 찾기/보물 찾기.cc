#include <cmath>
#include <iomanip>
#include <iostream>
using namespace std;

double a, b;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> a >> b;
    cout << fixed << setprecision(4);
    cout << sqrt(a*b) << " " << sqrt(a*b) << '\n';
}