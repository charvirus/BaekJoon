#include <algorithm>
#include <iostream>

using namespace std;

bool vst[1000000];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, a = 0;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        vst[a] = true;
        int nx = a - i;
        if (nx<0||vst[nx]) {
            nx = a + i;
        }
        a = nx;
    }
    cout << a << endl;
}
