#include <iostream>
#include <list>
#include <stack>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int m;
    string s;
    stack<char> left;
    stack<char> right;

    cin >> s;
    for (auto c: s) { left.push(c); }
    cin >> m;
    while (m--) {
        char cmd, c;
        cin >> cmd;
        switch (cmd) {
            case 'L':
                if (!left.empty()) {
                    right.push(left.top());
                    left.pop();
                }
                break;
            case 'D':
                if (!right.empty()) {
                    left.push(right.top());
                    right.pop();
                }
                break;
            case 'B':
                if (!left.empty()) {
                    left.pop();
                }
                break;
            case 'P':
                cin >> c;
                left.push(c);
                break;
        }
    }
    while (!left.empty()) {
        right.push(left.top());
        left.pop();
    }
    while (!right.empty()) {
        cout << right.top();
        right.pop();
    }
}
