#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, l, h, arr[1001], maxH, maxHidx, result,lft,rght;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> l >> h;
        arr[l] = h;

        if (maxH < h) {
            maxH = h;
            maxHidx = l;
        }
    }
    result += maxH;

    for (int i = 1; i < maxHidx; i++) {
        lft = max(arr[i],lft);
        result += lft;
    }

    for (int i = 1000;i>maxHidx;i--) {
        rght = max(arr[i],rght);
        result+=rght;
    }
    cout<<result;
}
