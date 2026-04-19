#include <algorithm>
#include <iostream>
using namespace std;

int n, gc, arr[101];

int gcd(int a, int b) {
    while (b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int a = arr[0];
    for (int i = 1; i < n; i++) {
        int b = arr[i];
        gc = gcd(a, b);
        cout << a / gc << "/" << b / gc << '\n';
    }
}
