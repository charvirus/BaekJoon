#include <algorithm>
#include <cmath>
#include <iostream>

using namespace std;
int n;
string s, ss;
char vowels[] = {'a', 'e', 'i', 'o', 'u'};

bool first(string a, string b) {
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    return a == b;
}

bool second(string a, string b) {
    if (a.front() != b.front() || a.back() != b.back()) return false;
    return true;
}

bool third(string a, string b) {
    for (char c: vowels) {
        a.erase(remove(a.begin(), a.end(), c), a.end());
        b.erase(remove(b.begin(), b.end(), c), b.end());
    }
    if (a == b) return true;
    else return false;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    cin >> s;
    cin >> ss;
    cout << (first(s, ss) && second(s, ss) && third(s, ss) ? "YES" : "NO") << endl;
}
