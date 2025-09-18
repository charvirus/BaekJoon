#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>

using namespace std;
int x, c = 1;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string s;
    cin >> s;
    while (s != "R0C0") {
        int cidx = 0;
        while (s[cidx] != 'C') cidx++;
        int R = stoi(s.substr(1, cidx - 1)), C = stoi(s.substr(cidx + 1, s.length() - cidx - 1));
        vector<char> ans;
        while (C) {
            ans.push_back(--C % 26 + 'A');
            C /= 26;
        }
        while (!ans.empty()) {
            cout << ans.back();
            ans.pop_back();
        }
        cout << R << "\n";
        cin >> s;
    }
}
