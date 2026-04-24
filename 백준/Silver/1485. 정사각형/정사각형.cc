#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;
int n;

long length(long ax, long ay, long bx, long by) {
    return pow(ax - bx, 2) + pow(ay - by, 2);
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >>n;
    for (int i = 0; i < n; i++) {
        vector<pair<int, int> > arr;
        bool flag = false;
        for (int j = 0; j < 4; j++) {
            int a, b;
            cin >> a >> b;
            arr.emplace_back(a, b);
        }
        sort(arr.begin(), arr.end());
        long len1 = length(arr[0].first,arr[0].second,arr[1].first,arr[1].second);
        long len2 = length(arr[0].first,arr[0].second,arr[2].first,arr[2].second);
        long len3 = length(arr[1].first,arr[1].second,arr[3].first,arr[3].second);
        long len4 = length(arr[2].first,arr[2].second,arr[3].first,arr[3].second);

        long diag1 =  length(arr[0].first,arr[0].second,arr[3].first,arr[3].second);
        long diag2 =  length(arr[1].first,arr[1].second,arr[2].first,arr[2].second);

        if (len1 == len2 && len2 == len3 && len3 == len4 && len4 == len1 && diag1 == diag2) {
            cout<<"1\n";
        }else {
            cout<<"0\n";
        }
    }
}
