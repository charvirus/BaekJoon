#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        long a, b;
        bool flag = false;
        vector<int> inp;
        cin >> a >> b;
        while (a != 0) {
            inp.push_back(a % b);
            a /= b;
        }
        int size = inp.size();
        for (int j = 0; j < size / 2; j++) {
            if (inp[j] != inp[size - j - 1]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            cout << "0\n";
        } else {
            cout << "1\n";
        }
    }
}
