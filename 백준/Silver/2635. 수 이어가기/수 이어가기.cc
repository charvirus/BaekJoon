#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;
int n;
vector<int> a;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 1; i <= n; i++) {
        vector<int> tmp;
        tmp.push_back(n);
        tmp.push_back(i);
        for (int j = 1;; j++) {
            if (tmp[j - 1] - tmp[j] < 0) {
                break;
            }
            tmp.push_back(tmp[j - 1] - tmp[j]);
        }
        if (tmp.size() > a.size()) {
            a = tmp;
        }
    }
    cout<<a.size()<<'\n';
    for (auto i : a)
    {
        cout<<i<<" ";
    }
}
