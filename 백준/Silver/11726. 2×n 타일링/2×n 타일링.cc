#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n+1];
    arr[1]=1;
    arr[2]=2;
    for (int i = 3; i <= n; i++) {
        arr[i] = (arr[i - 2] + arr[i - 1])%10007;
    }
    cout << arr[n] << endl;
}
