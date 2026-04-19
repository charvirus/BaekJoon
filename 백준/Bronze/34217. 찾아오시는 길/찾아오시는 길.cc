#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    if (a+c==b+d) {
        cout<<"Either";
    }
    else if (a+c < b+d) {
        cout<<"Hanyang Univ.";
    }
    else {
        cout<<"Yongdap";
    }

}
