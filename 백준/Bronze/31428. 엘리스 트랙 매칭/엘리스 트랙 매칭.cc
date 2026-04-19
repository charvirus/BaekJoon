#include <iostream>
using namespace std;
int arr[26], n;
char inp;

int main() {
    ios_base::sync_with_stdio(0), cin.tie(0);
    cout.tie(0);
    cin >> n;
    while (n--) {
        cin >> inp;
        ++arr[inp - 'A'];
    }
    cin >> inp;
    cout << arr[inp - 'A'] << '\n';
}
