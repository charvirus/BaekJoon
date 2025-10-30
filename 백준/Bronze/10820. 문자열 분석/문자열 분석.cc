#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string inp;
    while (true) {
        int lc = 0, uc = 0, nc = 0, bc = 0;
        getline(cin, inp);
        if (inp.empty()) {
            break;
        }
        for (int i = 0; i < inp.length(); i++) {
            if (inp[i] == ' ') {
                bc++;
            }else if (48<=inp[i]&&inp[i]<=57) {
                nc++;
            }else if (65<=inp[i]&&inp[i]<=90) {
                uc++;
            }else if (97<=inp[i]&&inp[i]<=122) {
                lc++;
            }
        }
        cout << lc<<" "<<uc<<" "<<nc<<" "<<bc<<"\n";
    }
}
