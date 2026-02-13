#include <algorithm>
#include <iostream>
using namespace std;

string inp;
int i;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> inp;
    for (i = 0; i < inp.length(); i++) {
        if (inp[i] == 'p' && inp[i + 1] == 'i') {
            i++;
        } else if (inp[i] == 'k' && inp[i + 1] == 'a') {
            i++;
        } else if (inp[i] == 'c' && inp[i + 1] == 'h' && inp[i + 2] == 'u') {
            i +=2;
        }else {
            cout<<"NO";
            return 0;
        }
    }
    cout<<"YES";
}
