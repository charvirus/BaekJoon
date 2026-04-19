#include <algorithm>
#include <iostream>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a;
    cin >> a;
    if (a>= 13) {
        a += 1;
    }
    cout << a;
}
