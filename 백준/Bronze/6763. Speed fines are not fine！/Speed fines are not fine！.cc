#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b;
    cin >> a >> b;

    if (a >= b) {
        cout << "Congratulations, you are within the speed limit!";
    } else {
        int dif = b-a;
        int fine = 0;
        if (1 <= dif && dif <= 20) {
            fine = 100;
        }else if (21<=dif&&dif<=30) {
            fine = 270;
        }else {
            fine = 500;
        }
        cout<<"You are speeding and your fine is $"<<fine<<".";
    }
}
