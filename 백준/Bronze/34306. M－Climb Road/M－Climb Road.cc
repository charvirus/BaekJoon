#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b;
    cin >> a >> b;
    cout<<int(a*5280/b);
}
