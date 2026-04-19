#include <algorithm>
#include <iostream>
using namespace std;

int a, i;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> i;
    cout << a * (i-1)+1;
}
