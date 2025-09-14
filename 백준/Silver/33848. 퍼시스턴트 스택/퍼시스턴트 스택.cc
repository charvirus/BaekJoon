#include <algorithm>
#include <cmath>
#include <iostream>
#include <stack>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    stack<int> stk;
    stack<pair<int,int>> hst;
    for (int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        switch (inp) {
                int x;
            case 1:
                cin >> x;
                stk.push(x);
                hst.push({2,x});
                break;
            case 2:
                if (!stk.empty()) {
                    hst.push({1,stk.top()});
                    stk.pop();
                }
                break;
            case 3:
                cin >> x;
                while (x-- && hst.size() != 0) {
                    int cmd = hst.top().first;
                    int data = hst.top().second;
                    if (cmd == 1) {
                        stk.push(data);
                    }else if (cmd == 2) {
                        stk.pop();
                    }
                    hst.pop();
                }
                break;
            case 4:
                cout << stk.size() << "\n";
                break;
            case 5:
                if (stk.size()) {
                    cout << stk.top() << "\n";
                } else {
                    cout << -1 << "\n";
                }
                break;
        }
    }
}
