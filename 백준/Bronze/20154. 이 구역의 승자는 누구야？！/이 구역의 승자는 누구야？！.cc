#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int azn[26] = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1}, sm = 0;
    string inp;
    cin >> inp;
    for (int i = 0; i < inp.size(); i++) {
        sm += azn[inp[i] - 'A'];
    }
    if (sm % 2) {
        cout << "I'm a winner!";
    } else {
        cout << "You're the winner?";
    }
}
