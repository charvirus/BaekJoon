#include <algorithm>
#include <iostream>
using namespace std;

int n, groupn = 1;
string name[21][21];

void check(int n, bool &flag) {
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j++) {
            if (name[i][j] == "N") {
                flag = true;
                cout << name[(i - j+n) % n][0] << " was nasty about " << name[i][0] << "\n";
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (1) {
        bool flag = false;
        cin >> n;
        if (n == 0) break;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cin >> name[i][j];
            }
        }

        cout << "Group " << groupn++ << "\n";
        check(n, flag);
        if (!flag) {
            cout << "Nobody was nasty\n";
        }
        cout << "\n";
    }
}
