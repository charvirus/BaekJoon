#include <algorithm>
#include <iomanip>
#include <iostream>
#include <vector>
using namespace std;

double dia, turn, ttime;
int cnt;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cout << fixed << setprecision(2);
    while (1) {
        cnt++;
        cin >> dia >> turn >> ttime;
        if (!turn) break;
        double move = dia * turn * 3.14159265359 / (5280.0 * 12.0);
        printf("Trip #%d: %.2f %.2f\n", cnt, move, move / ttime * 3600);
    }
}
