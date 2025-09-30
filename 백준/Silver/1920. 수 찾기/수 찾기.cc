#include <iostream>
#include <unordered_set>
using namespace std;

int n, m, inp;
unordered_set<int> us;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n--) {
        cin >> inp;
        us.insert(inp);
    }
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> inp;
        if (us.find(inp) != us.end()) {
            cout<<"1\n";
        }else {
            cout<<"0\n";
        }
    }
}
