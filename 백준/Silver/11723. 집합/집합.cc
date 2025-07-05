#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    int arr[21] = {0};
    int T, ninp;
    cin >> T;
    string inp;
    while (T--) {
        cin >> inp;
        if (inp == "add") {
            cin >> ninp;
            arr[ninp] = 1;
        } else if (inp == "remove") {
            cin >> ninp;
            arr[ninp] = 0;
        } else if (inp == "check") {
            cin >> ninp;
            if (arr[ninp])cout << "1\n";
            else cout << "0\n";
        } else if (inp == "toggle") {
            cin >> ninp;
            if (arr[ninp]) arr[ninp] = 0;
            else arr[ninp] = 1;
        } else if (inp == "all") {
            for (int i = 1; i <= 20; i++)
                arr[i] = 1;
        } else if (inp == "empty") {
            for (int i = 1; i <= 20; i++)
                arr[i] = 0;
        }
    }
}