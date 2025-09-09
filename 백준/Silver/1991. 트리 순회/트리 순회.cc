#include <algorithm>
#include <iostream>

using namespace std;
int n;
int arr[26][2];

void pre(int floor) {
    if (floor < 0) {
        return;
    }
    printf("%c", floor + 65);
    pre(arr[floor][0]);
    pre(arr[floor][1]);
}

void in(int floor) {
    if (floor < 0) {
        return;
    }
    in(arr[floor][0]);
    printf("%c", floor + 65);
    in(arr[floor][1]);
}

void post(int floor) {
    if (floor < 0) {
        return;
    }
    post(arr[floor][0]);
    post(arr[floor][1]);
    printf("%c", floor + 65);
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    char a, b, c;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> a >> b >> c;
        arr[a - 65][0] = b - 65;
        arr[a - 65][1] = c - 65;
    }
    pre(0);
    printf("\n");
    in(0);
    printf("\n");
    post(0);
    printf("\n");
}
