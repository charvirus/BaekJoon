#include <iostream>
#include <stack>

using namespace std;


int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int tmp = 1, ans = 0;
    string inp;
    cin >> inp;
    stack<char> st;
    for (int i = 0; i < inp.length(); i++) {
        if (inp[i] == '(') {
            tmp *= 2;
            st.push(inp[i]);
        } else if (inp[i] == '[') {
            tmp *= 3;
            st.push(inp[i]);
        } else if (inp[i] == ')') {
            if (st.empty() || st.top() != '(') {
                ans = 0;
                break;
            }
            if (inp[i - 1] == '(') {
                ans += tmp;
            }
            st.pop();
            tmp /= 2;
        } else if (inp[i] == ']') {
            if (st.empty() || st.top() != '[') {
                ans = 0;
                break;
            }
            if (inp[i - 1] == '[') {
                ans += tmp;
            }
            st.pop();
            tmp /= 3;
        }
    }
    if (!st.empty()) {
        ans = 0;
    }
    cout << ans;
}
