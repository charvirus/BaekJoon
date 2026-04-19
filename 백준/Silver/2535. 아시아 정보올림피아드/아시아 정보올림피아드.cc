#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;
vector<pair<int,pair<int,int>>> v;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    cin >> n;
    while (n--) {
        int a,b,c;
        cin >> a >> b >> c;
        v.push_back({c,{a,b}});
    }
    sort(v.begin(), v.end(),greater<pair<int,pair<int,int>>>());
    cout << v[0].second.first <<' '<< v[0].second.second << '\n';
    cout << v[1].second.first <<' '<< v[1].second.second << '\n';

    if (v[0].second.first == v[1].second.first) {
        for (int i = 2;i < v.size(); i++) {
            if (v[i].second.first != v[0].second.first) {
                cout << v[i].second.first <<' '<< v[i].second.second << '\n';
                break;
            }
        }
    }else {
        cout << v[2].second.first <<' '<< v[2].second.second << '\n';
    }
}
