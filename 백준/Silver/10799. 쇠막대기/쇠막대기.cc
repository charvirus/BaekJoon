#include <iostream>
#include <stack>

using namespace std;


int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int cnt = 0;
    string inp;
    cin >> inp;
    stack<char> s;
    for (int i = 0; i < inp.length(); i++) {
        if (inp[i] == '(') {
            s.push(inp[i]);
        } else {
            if (inp[i - 1] == '(') {
                s.pop();
                cnt += s.size();
            } else {
                s.pop();
                cnt += 1;
            }
        }
    }
    cout << cnt;
}
