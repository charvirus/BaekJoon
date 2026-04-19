#include <algorithm>
#include <iostream>
#include <map>
#include <queue>
#include <vector>
using namespace std;


priority_queue<int, vector<int>, greater<int> > minq;
priority_queue<int, vector<int>, less<int> > maxq;
map<int, int> cnt;

void init() {
    while (!minq.empty()) {
        minq.pop();
    }
    while (!maxq.empty()) {
        maxq.pop();
    }
    cnt.clear();
}

void update() {
    while (!minq.empty() && !cnt[minq.top()]) {
        minq.pop();
    }
    while (!maxq.empty() && !cnt[maxq.top()]) {
        maxq.pop();
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, inp,cinp;
    char cmd;
    cin >> n;
    while (n--) {
        init();
        cin >> inp;
        for (int i = 0; i < inp; i++) {
            cin >> cmd >> cinp;
            if (cmd == 'D') {
                if (cinp == -1 && !minq.empty()) {
                    cnt[minq.top()]--;
                    minq.pop();
                } else if (cinp == 1 && !maxq.empty()) {
                    cnt[maxq.top()]--;
                    maxq.pop();
                }
                update();
            } else if (cmd == 'I') {
                maxq.push(cinp);
                minq.push(cinp);
                cnt[cinp]++;
            }
        }
        if (minq.empty() || maxq.empty()) {
            cout << "EMPTY" << '\n';
        } else {
            cout << maxq.top() << ' ' << minq.top() << '\n';
        }
    }
}
