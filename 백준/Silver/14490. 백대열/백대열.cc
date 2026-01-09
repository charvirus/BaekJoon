#include <iostream>
using namespace std;
int n, m;
char c;

int gcd(int a, int b) {
    while (b) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}


int main(void) {
    cin >> n >>c>> m;
    int g = gcd(n, m);
    cout<<n/g<<":"<<m/g<<endl;
}
