#include <cmath>
#include <iostream>
using namespace std;
float l, r, sum,i=2;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> l >> r;
    while (1) {
        float temp = floor(l * (r / 100));

        if (temp<=5)break;
        sum += i*temp;
        l = temp;
        i*=2;
    }
    cout << sum;
}
