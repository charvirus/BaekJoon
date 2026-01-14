#include <iostream>
using namespace std;
int h, w, n, m,cnt;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> h >> w >> n >> m;

    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            cnt++;
            j+=m;
        }
        i+=n;
    }
    cout << cnt ;
}
