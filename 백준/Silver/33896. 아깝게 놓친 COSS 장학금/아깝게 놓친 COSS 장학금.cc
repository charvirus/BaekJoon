#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

struct Student {
    string name;
    int s, r, c;
};

inline bool compare(const Student &a, const Student &b) {
    int ae = pow(a.s, 3) / (a.c * (a.r + 1));
    int be = pow(b.s, 3) / (b.c * (b.r + 1));
    if (ae == be) {
        if (ae == be && a.c == b.c) {
            return a.name < b.name;
        }
        return a.c < b.c;
    }
    return ae > be;
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    string name;
    cin >> n;
    vector<Student> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i].name >> v[i].s >> v[i].r >> v[i].c;
    }
    sort(v.begin(), v.end(), compare);
    cout << v[1].name;
}
