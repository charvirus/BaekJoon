#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    string s;
    cin >> s;
    for (char a = 'a'; a <= 'z'; a++) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == a) {
                cnt++;
            }
        }
        cout << cnt << " ";
    }
}
