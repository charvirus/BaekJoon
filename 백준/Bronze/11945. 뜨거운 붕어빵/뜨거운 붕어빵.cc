#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m;
    string s;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> s;
        for (int j = s.length()-1;j>=0;j--) {
            cout<<s[j];
        }
        cout<<"\n";
    }
}
