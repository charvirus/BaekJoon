#include <iostream>
using namespace std;
int n, arr[10],i;
bool flag;
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];

    }
    if (n==1) {
        if (arr[0]==0) {
            cout<<"YES\n0";
            return 0;
        }
    }
    cout<<"YES\n"<<arr[n-1]<<arr[n-1]<<arr[n-1];

}
