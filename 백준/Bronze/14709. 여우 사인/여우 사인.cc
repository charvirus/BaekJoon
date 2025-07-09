#include <iostream>
using namespace std;
bool arr[5];
int n;

int main() {
    ios_base::sync_with_stdio(0), cin.tie(0);
    cout.tie(0);
    cin >> n;
    if (n != 3) cout << "Woof-meow-tweet-squeek";
    else {
        while (n--) {
            int a, b;
            cin >> a >> b;
            a -= 1, b -= 1;
            arr[a] = arr[b] = true;
        }

        if (arr[1] == false && arr[4] == false) {
            cout << "Wa-pa-pa-pa-pa-pa-pow!";
        } else {
            cout << "Woof-meow-tweet-squeek";
        }
    }
}
