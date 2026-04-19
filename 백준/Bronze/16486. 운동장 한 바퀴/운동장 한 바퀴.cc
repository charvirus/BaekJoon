#include <algorithm>
#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int hrz = 0,circum =0;
    cin >> hrz >> circum;
    cout<<fixed;
    cout.precision(6);
    cout << hrz*2+2*circum*3.141592;
}