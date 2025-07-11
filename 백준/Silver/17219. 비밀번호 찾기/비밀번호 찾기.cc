#include <iostream>
#include <map>
using namespace std;


int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    string key, p;
    map<string, string> pw;
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> key >> p;
        pw.insert({key,p});
    }
    for (int i = 0; i < m; i++) {
        cin >> key;
        cout << pw[key] << '\n';
    }
}