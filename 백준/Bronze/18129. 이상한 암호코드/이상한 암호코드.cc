#include <iostream>
#include <string>
using namespace std;

int k;
string s;
bool vst[128];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    vst['#'] = 1;

    cin >> s >> k;
    s += '#';

    char old = '#';
    int cmb = 0;

    for (auto& l: s) {
        l = toupper(l);
        if (l != old) {
            if (!vst[old]) {
                if (cmb >= k) {
                    cout << 1;
                } else {
                    cout << 0;
                }
                vst[old] = 1;
            }
            old = l, cmb = 1;
        } else {
            cmb++;
        }
    }
}
