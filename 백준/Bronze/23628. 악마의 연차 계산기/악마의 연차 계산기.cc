#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int sy, sm, sd, ey, em, ed, total, yb, mb;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> sy >> sm >> sd;
    cin >> ey >> em >> ed;

    total = (ey - sy) * 360 + (em - sm) * 30 + ed - sd;
    int year = total / 360;
    for (int i = 1; i <= year; i++) {
        int temp = i;
        if (temp % 2 == 0) {
            temp--;
        }
        int a = temp - (temp / 2 + 1);
        yb += a + 15;
    }

    mb = total / 30;
    if (mb > 36) mb = 36;

    cout << yb << " " << mb << "\n" << total << "days";
}
