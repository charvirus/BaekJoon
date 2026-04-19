#include <algorithm>
#include <iostream>


using namespace std;
int n, m, sum;
bool k[1001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        int inp;
        cin >> inp;
        for (int j = 1; j <= n; j++) {
            if (j % inp == 0) {
                k[j] = true;
            }
        }
    }
    for (int i = 0; i < 1001; i++) {
        if (k[i]) {
            sum += i;
        }
    }
    cout << sum;
}
