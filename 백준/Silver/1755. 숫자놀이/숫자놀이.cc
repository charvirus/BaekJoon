#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;
int m, n;
vector<pair<string, int> > arr;
string numbers[] = {
    "zero ", "one ", "two ", "three ", "four ",
    "five ", "six ", "seven ", "eight ", "nine "
};
string st;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> m >> n;
    for (int i = m; i <= n; i++) {
        string a = numbers[i / 10], b = numbers[i % 10];
        if (i / 10) {
            st = a + " " + b;
            arr.emplace_back(st, i);
        } else {
            arr.emplace_back(b, i);
        }
    }
    sort(arr.begin(), arr.end());
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i].second << " ";
        if (i%10==9) cout<<"\n";
    }
}
