#include <iostream>
#include <queue>
using namespace std;

priority_queue<int, vector<int>,less<int>> pq;
int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        if (inp == 0) {
            if (!pq.empty()) {
                int temp = pq.top();
                cout << temp << '\n';
                pq.pop();
            }else
                cout << 0 << '\n';
        }else {
            pq.push(inp);
        }
    }
}
