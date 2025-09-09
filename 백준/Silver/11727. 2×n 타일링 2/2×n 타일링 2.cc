#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n+1];
    arr[1]=1;
    arr[2]=3;
    arr[3]=5;
    for (int i = 4; i <= n; i++) {
        arr[i] = (arr[i - 2]*2 + arr[i - 1])%10007;
    }
    cout << arr[n] << endl;
}
