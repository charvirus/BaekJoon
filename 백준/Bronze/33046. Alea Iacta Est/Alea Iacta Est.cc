#include <algorithm>
#include <iostream>
using namespace std;
int a, b, c, d;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> b >> c >> d;
    int fst = (a + b-1) % 4;

    fst = (fst + c + d-1) % 4;

    cout<<fst+1;
}
