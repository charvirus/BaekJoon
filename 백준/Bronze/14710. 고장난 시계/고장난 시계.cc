#include <iostream>
using namespace std;
int t1,t2,z;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t1>>t2;

    z = t1 % 30;

    if (z*12==t2) {
        cout<<"O";
    }else {
        cout<<"X";
    }
}
