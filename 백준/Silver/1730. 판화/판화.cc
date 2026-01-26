#include <iostream>

using namespace std;
int inp;
string m;
bool h[100][100];
bool v[100][100];
int cy, cx;

bool isValid(int y, int x) {
    if (0 <= x && x < inp && 0 <= y && y < inp) {
        return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> inp;
    cin >> m;
    for (int i = 0; i < m.length(); i++) {
        if (m[i] == 'U') {
            if (isValid(cy-1,cx)) {
                h[cy][cx] = true;
                h[--cy][cx] = true;
            }
        }else if (m[i] == 'D') {
            if (isValid(cy+1,cx)) {
                h[cy][cx] = true;
                h[++cy][cx] = true;
            }
        }else if (m[i]=='L') {
            if (isValid(cy,cx-1)) {
                v[cy][cx] = true;
                v[cy][--cx] = true;
            }
        }else if (m[i] == 'R') {
            if (isValid(cy,cx+1)) {
                v[cy][cx] = true;
                v[cy][++cx] = true;
            }
        }
    }
    for (int i = 0;i<inp;i++) {
        for (int j = 0;j<inp;j++) {
            if (h[i][j] && v[i][j]) {
                cout <<"+";
            }else if (h[i][j]) {
                cout <<"|";
            }else if (v[i][j]) {
                cout <<"-";
            }else {
                cout<<".";
            }
        }
        cout << "\n";
    }
}