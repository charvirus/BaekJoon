#include <iostream>
#include <stack>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    stack<int> st;
    long inp;
    cin >> inp;
    while (inp) {
        st.push(inp%2);
        inp = inp / 2;
    }
    while (!st.empty()) {
        cout<<st.top();
        st.pop();
    }
}
