#include <cmath>
#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int main(void) {
    int a, b, m, dec = 0, temp = 0;
    cin >> a >> b >> m;
    stack<int> s;
    vector<int> v(m);
    for (int i = m - 1; i >= 0; i--) {
        cin >> v[i];
    }
    for (int i = 0; i < m; i++) {
        dec += v[i] * pow(a, i);
    }
    while (dec >= b) {
        temp = dec % b;
        s.push(temp);
        dec /= b;
    }
    s.push(dec%b);
    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
}
