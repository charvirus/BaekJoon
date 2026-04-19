#include <algorithm>
#include <iostream>
#include <map>

using namespace std;
string str, inp;
int n, idx;
map<char, int> conv = {
    {'0', 0},
    {'1', 1},
    {'2', 2},
    {'3', 3},
    {'4', 4},
    {'5', 5},
    {'6', 6},
    {'7', 7},
    {'8', 8},
    {'9', 9},
    {'a', 10},
    {'b', 11},
    {'c', 12},
    {'d', 13},
    {'e', 14},
    {'f', 15}
};

long long calculate(string &st, int stp, int byte) {
    long long res = 0;
    long long size = 1;
    for (int t = byte + stp - 1; t >= stp; --t) {
        res += conv[st[t]] * size;
        size *= 16;
    }
    return res;
}


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> str >> n;
    for (int i = 0;i<n;i++) {
        cin >> inp;
        if (inp == "char") {
            cout << calculate(str, idx, 2) << " ";
            idx += 2;
        } else if (inp == "int") {
            cout << calculate(str, idx, 8) << " ";
            idx += 8;
        } else {
            cout << calculate(str, idx, 16) << " ";
            idx += 16;
        }
    }
}
