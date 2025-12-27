#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;
int n;
int arr[1000000];
int arm[1000000];

bool des(int a, int b) {
    return a > b;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    sort(arr, arr + n, des);
    for (int i = 0; i < n; i++) {
        arm[i] = i + 1 + arr[i];
    }
    sort(arm,arm+n,des);
    cout<<arm[0]+1;
}
