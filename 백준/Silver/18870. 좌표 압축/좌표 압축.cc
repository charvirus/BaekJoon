#include <algorithm>
#include<iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0;i<n;i++)
        cin>>v[i];
    vector<int> ans(v);
    sort(ans.begin(), ans.end());
    ans.erase(unique(ans.begin(), ans.end()), ans.end());

    for (const auto &i : v) {
        auto it =  lower_bound(ans.begin(), ans.end(), i);
        cout << distance(ans.begin(), it)<<' ';
    }
}
