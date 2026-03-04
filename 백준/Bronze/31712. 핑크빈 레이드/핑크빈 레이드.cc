#include <iostream>
using namespace std;
int cu, du, cd, dd, cp, dp, h,  i;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> cu >> du >> cd >> dd >> cp >> dp >> h;
    while (1) {
        if (i % cu == 0) {
            h -= du;
        }
        if (i % cd == 0) {
            h -= dd;
        }
        if (i % cp == 0) {
            h -= dp;
        }
        if (h<=0) {
            break;
        }
        i++;
    }
    cout<<i;
}
