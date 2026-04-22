#include <algorithm>
#include <iostream>
using namespace std;

double dia, turn, ttime;
int cnt = 0;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (1) {
        cnt++;
        cin >> dia >> turn >> ttime;
        if (!turn) break;
        double move = dia * turn * 3.1415927 / (5280.0 * 12.0);
        printf("Trip #%d: %.2f %.2f\n", cnt, move, move / ttime * 3600);
    }
}
