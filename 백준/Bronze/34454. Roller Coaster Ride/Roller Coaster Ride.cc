#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a,b,c;
    cin >> a >> b>>c;
    if (a > b*c) {
        cout<<"no";
    }else {
        cout<<"yes";
    }
}
