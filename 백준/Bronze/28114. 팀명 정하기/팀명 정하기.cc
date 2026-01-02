#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    vector<int> year;
    vector<pair<int, string> > name;
    for (int i = 0; i < 3; i++) {
        int sol,yr;
        string nm;
        cin >> sol >> yr >> nm;
        year.push_back(yr);
        name.emplace_back(sol,nm);
    }
    sort(year.begin(), year.end());
    sort(name.begin(), name.end());
    for (int i = 0; i < 3; i++) {
        cout << year[i]%100;
    }
    cout << endl;
    for (int i = 2; i >=0; i--) {
        cout<<name[i].second[0];
    }
}
