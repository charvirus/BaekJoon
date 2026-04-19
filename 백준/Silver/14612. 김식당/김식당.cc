#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;
int n, m;
string cmd;
vector<pair<int, int> > v;


int main(void) {
    int t, tt;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        cin >> cmd;
        if (cmd == "order") {
            cin >> t >> tt;
            v.push_back(make_pair(tt, t));
        } else if (cmd == "sort") {
            sort(v.begin(), v.end());
        } else if (cmd == "complete") {
            cin >> t;
            for (int j = v.size() - 1; j >= 0; j--) {
                if (v[j].second == t) {
                    v.erase(v.begin() + j);
                    break;
                }
            }
        }
        if (v.empty()) {
            cout << "sleep" << '\n';
            continue;
        }
        for (int j = 0; j < v.size(); j++) {
            cout << v[j].second << ' ';
        }
        cout << '\n';
    }
}
