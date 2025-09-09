#include <algorithm>
#include<iostream>
#include <queue>

using namespace std;
int n, type, arr[10], ans;
queue<int> q;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    while (n--) {
        int fruit;
        cin >> fruit;
        q.push(fruit);
        if (arr[fruit]++ == 0) {
            ++type;
        }
        while (type > 2) {
            fruit = q.front();
            q.pop();
            if (--arr[fruit] == 0) {
                --type;
            }
        }
        ans = max(ans, int(q.size()));
    }
    cout << ans;
}
