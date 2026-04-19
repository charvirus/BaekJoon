#include <deque>
#include <iostream>

using namespace std;


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    deque<int> dq;
    dq.push_back(n);
    for (int i = n - 1; i > 0; i--) {
        dq.push_front(i);
        for (int j = 0; j < i; j++) {
            int temp = dq.back();
            dq.pop_back();
            dq.push_front(temp);
        }
    }

    for (int i: dq) {
        cout << i << " ";
    }
}
