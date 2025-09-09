#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

bool cmp(string a, string b) {
    return a > b;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;
    vector<string> arr1(n);
    vector<string> arr2(n);
    for (int i = 0; i < n; i++) {
        cin >> arr1[i];
    }
    copy(arr1.begin(), arr1.end(), arr2.begin());
    sort(arr2.begin(), arr2.end());
    if (arr1 == arr2) {
        cout << "INCREASING";
        return 0;
    }
    sort(arr2.begin(), arr2.end(), cmp);
    if (arr1 == arr2) {
        cout << "DECREASING";
    }else {
        cout << "NEITHER";
    }

}
