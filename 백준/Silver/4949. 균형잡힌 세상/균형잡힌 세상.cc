#include <iostream>
#include <stack>

using namespace std;


int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (true) {
        string inp;
        getline(cin, inp);
        if (inp == ".") {
            break;
        }
        stack<char> s;
        bool flag = true;
        for (auto a: inp) {
            if (a == '(' || a == '[') {
                s.push(a);
            } else if (a == ')') {
               if (s.empty()||s.top() != '(') {
                   flag = false;
                   break;
               }
                s.pop();
            } else if (a == ']') {
                if (s.empty()||s.top() != '[') {
                    flag = false;
                    break;
                }
                s.pop();
            }
        }

        if (!s.empty()) {
            flag = false;
        }
        if (flag) {
            cout << "yes" << '\n';
        } else {
            cout << "no" << '\n';
        }
    }
}
