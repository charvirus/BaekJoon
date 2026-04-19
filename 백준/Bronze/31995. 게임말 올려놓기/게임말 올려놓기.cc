#include <cmath>
#include <cstring>
#include <iostream>
#include <vector>
using namespace std;
int n, m;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    if (n == 1 || m == 1) {
        cout<<0;
    }else {
        cout<< (n-1) * (m-1)*2;
    }
}
