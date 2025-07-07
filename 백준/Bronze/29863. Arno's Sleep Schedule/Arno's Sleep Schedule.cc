#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int a,b;
    cin>>a;
    cin>>b;
    if (a>=20 ) {
        a -=24;
    }
    cout<<b-a<<endl;
}
