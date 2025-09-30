#include <iostream>
#include <sstream>
#include <unordered_set>
using namespace std;

string inp, keyword;
int n, m;
unordered_set<string> us;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    while (n--) {
        cin >> inp;
        us.insert(inp);
    }

    while (m--) {
        cin >> inp;
        stringstream sts(inp);
        while (getline(sts, keyword, ',')) {
            if (us.find(keyword) == us.end())continue;
            us.erase(keyword);
        }
        cout << us.size() << '\n';
    }
}
