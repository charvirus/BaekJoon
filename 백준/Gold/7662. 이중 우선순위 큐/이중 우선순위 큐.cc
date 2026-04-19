#include <algorithm>
#include <iostream>
#include <set>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, inp;
    cin >> n;
    while (n--) {
        multiset<int> s;
        int cn;
        cin >> cn;
        for (int i = 0; i < cn; i++) {
            char cmd;
            cin >> cmd;
            if (cmd == 'I') {
                cin >> inp;
                s.insert(inp);
            } else if (cmd == 'D') {
                cin >> inp;
                if (!s.empty() && inp == -1) {
                    s.erase(s.begin());
                } else if (!s.empty() && inp == 1) {
                    auto it = s.end();
                    it--;
                    s.erase(it);
                }
            }
        }
        if (s.empty()) {
            cout << "EMPTY" << '\n';
        } else {
            auto it = s.end();
            it--;
            cout << *it << ' ' << *s.begin() << '\n';
        }
    }
}
