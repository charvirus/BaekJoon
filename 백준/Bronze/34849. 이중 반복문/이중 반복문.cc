#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a;
    cin >> a;
    if (a>10000) {
        cout<<"Time limit exceeded";
    }else {
        cout<<"Accepted";
    }
}
