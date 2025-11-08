#include <cmath>
#include <iostream>
#include <set>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    while (n--) {
        int t, inp, cnt = 0;
        cin >> t;
        vector<int> left, right;
        for (int i = 0; i < t; i++) {
            cin >> inp;
            left.push_back(inp);
        }
        for (int i = 0; i < t; i++) {
            cin >> inp;
            right.push_back(inp);
        }

        for (int i = 1; i < t; i++) {
            for (int j = 0; j < t - 1; j++) {
                if (left[i] - left[j] == 500) {
                    for (int k = 0; k < t; k++) {
                        if (left[i] + 500 == right[k]) {
                            cnt++;
                            break;
                        }
                    }
                }
            }
        }
        cout << cnt << "\n";
    }
}
