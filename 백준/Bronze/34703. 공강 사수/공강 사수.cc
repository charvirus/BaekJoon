#include <iostream>
using namespace std;
int n,m[5];
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        m[inp-1]=1;
    }
    for (int i = 0;i<5;i++) {
        if (m[i]==0) {
            cout <<"YES";
            return 0;
        }
    }
    cout<<"NO";
}