#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string a;
    cin >> a;
    if (a[0]=='F') {
        cout<<"Foundation";
    }else if (a[0]=='C') {
        cout<<"Claves";
    }else if (a[0]=='V') {
        cout<<"Veritas";
    }else if (a[0]=='E') {
        cout<<"Exploration";
    }
}
