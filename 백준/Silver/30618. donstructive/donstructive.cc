#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n;
int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n ;
   for (int i = 1;i<=n;i+=2) {
       cout<<i<<" ";
   }

    if (n%2)n--;
    for (int i = n; i > 0; i-=2) {
        cout << i << " ";
    }
}
