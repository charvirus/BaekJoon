#include <algorithm>
#include <cstring>
#include <iostream>
#include <queue>
#include <string>
using namespace std;


int main(void) {
    int n, sum = 0;
    cin >> n;
    vector<tuple<int, string, int> > v;
    for (int i = 0; i < n; i++) {
        string s;
        int num, diff;
        cin >> s >> num >> diff;
        v.push_back(make_tuple(num, s, diff));
    }
    sort(v.begin(), v.end());
    for (int i = 0; i < n; i++) {
        int idx = get<2>(v[i]);
        string h = get<1>(v[i]).substr(idx-1,1);

        char ch;
        strcpy(&ch,h.c_str());
        cout << char(toupper(ch));
    }
}
