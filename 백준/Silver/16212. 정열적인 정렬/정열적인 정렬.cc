#include <algorithm>
#include <iostream>
using namespace std;

int n, arr[500001];
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0;i<n;i++) {
        cin >> arr[i];
    }
    sort(arr,arr+n);
    for (int i = 0;i<n;i++)cout<<arr[i]<<" ";
}