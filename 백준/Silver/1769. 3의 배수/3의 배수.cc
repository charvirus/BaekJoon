#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string inp;
    int x,tmp=0,cnt=0;
    cin >> inp;
    while (true) {

        if (inp.length() != 1) {
            tmp=0;
            for (int i = 0; i < inp.length(); i++) {
                tmp += (inp[i] - '0');
            }
            inp = to_string(tmp);
        }else {
            x=stoi(inp);
            break;
        }
        cnt++;
    }
    cout << cnt << endl;
    if (x%3==0) {
        cout << "YES" << endl;
    }else {
        cout << "NO" << endl;
    }
}
