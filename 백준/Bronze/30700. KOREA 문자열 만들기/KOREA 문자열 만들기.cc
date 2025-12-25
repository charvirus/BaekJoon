#include <cmath>
#include <iostream>
using namespace std;
string inp;
string kr = "KOREA";
int len;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> inp;
    for (int i = 0; i < inp.length(); i++) {
        if (kr[len%5] == inp[i]) {
            len++;
        }
    }
    cout << len;
}