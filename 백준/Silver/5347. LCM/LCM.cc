#include <cmath>
#include <iostream>
using namespace std;
long n,a,b;

int gcd(long a,long b) {
    while (b!=0) {
        long temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin>>n;
    for(int i=0;i<n;i++) {
        cin>>a>>b;
        cout<<a*b/ gcd(a,b)<<"\n";
    }
}