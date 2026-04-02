#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int t,n;
string s;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t;
    for (int i = 0;i<t;i++) {
        cin >> n;
        cin >> s;
        while (s.find("ABB") != string::npos) {
            s.replace(s.find("ABB"),3,"BA");
        }
        cout<<s<<"\n";
    }
}
