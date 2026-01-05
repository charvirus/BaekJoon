#include <cmath>
#include <iostream>
using namespace std;
int n,cnt;
string inp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> inp;
    for (int i = 0;i<n;i++) {
        switch (cnt) {
            case 0: if (inp[i] == 'P' && i % 2 == 0) cnt++; break;
            case 1: if (inp[i] == 'A' && i % 2 == 1) cnt++; break;
            case 2: if (inp[i] == 'U' && i % 2 == 0) cnt++; break;
            case 3: if (inp[i] == 'L' && i % 2 == 1) cnt++; break;
            default: break;
        }
    }
    cout<<(n%2==0&&cnt==4?"YES":"NO");

}