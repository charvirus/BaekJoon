#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int h, w;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> h >> w;
    char arr[h][w];
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < h; i++) {
        bool flag = false;
        int c = -1;
        for (int j = 0; j < w; j++) {
            if (arr[i][j] == 'c') {
                flag = true;
            }
            if ( flag) {
                c++;
            }
            if (arr[i][j]=='c') {
                c = 0;
            }
            cout<< c << " ";
        }
        cout<<"\n";
    }
}
