#include <algorithm>
#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    for (int i = 2; i <= 101; i++) {
        for (int j = 2; j <= 101; j++) {
            for (int k = j; k <= 101; k++) {
                for (int l = k; l <= 101; l++) {
                    if (i*i*i == j*j*j+k*k*k+l*l*l) {
                        printf("Cube = %d, Triple = (%d,%d,%d)\n",i,j,k,l);
                    }
                    if (i*i*i < j*j*j+k*k*k+l*l*l) {
                        break;
                    }
                }
            }
        }
    }
}
