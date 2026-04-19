#include <algorithm>
#include <deque>
#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, cnt;

    cin >> n;
    while (n--) {
        deque<int> dq;
        string cmd, inp, temp = "";
        bool flag = true, dir = true;
        cin >> cmd;
        cin >> cnt;
        cin >> inp;
        for (int i = 1; i < inp.size(); i++) {
            if (inp[i] == ',' || inp[i] == ']') {
                if (temp != "") {
                    dq.push_back(stoi(temp));
                    temp = "";
                }
            } else {
                temp += inp[i];
            }
        }
        for (int i = 0; i < cmd.length(); i++) {
            if (cmd[i] == 'R') {
                dir = !dir;
            } else if (cmd[i] == 'D') {
                if (dq.empty()) {
                    flag = false;
                    break;
                } else {
                    if (dir) {
                        dq.pop_front();
                    } else {
                        dq.pop_back();
                    }
                }
            }
        }
        if (!flag) {
            cout << "error" << '\n';
        } else {
            if (!dir) {
                reverse(dq.begin(), dq.end());
            }
            cout << "[";
            while (!dq.empty()) {
                cout << dq.front();
                dq.pop_front();
                if (!dq.empty()) {
                    cout << ",";
                }
            }
            cout << "]" << endl;
        }
    }
}
