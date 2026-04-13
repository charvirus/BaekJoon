#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

vector<pair<int, int> > quest;
int n, l, k, a, b, ans;

bool cmp(pair<int, int> a, pair<int, int> b) {
    return a.second < b.second;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> l >> k;
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        quest.emplace_back(a, b);
    }

    sort(quest.begin(), quest.end(), cmp);

    for (int i = 0; i < n; i++) {
        if (k == 0) {
            break;
        }
        if (quest[i].second <= l) {
            ans += 140;
            k--;
        } else if (quest[i].first <= l) {
            ans += 100;
            k--;
        }
    }
    cout << ans;
}
