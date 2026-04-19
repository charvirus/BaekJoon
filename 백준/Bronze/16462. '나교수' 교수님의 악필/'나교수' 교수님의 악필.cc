#include <cmath>
#include <iostream>

using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    int n, sum = 0;
    cin >> n;
    cin.ignore();
    for (int i = 0; i < n; i++) {
        string str;
        getline(cin, str);
        for (int j = 0; j < str.length(); j++) {
            if (str[j] == '0' || str[j] == '6'  ) {
                str[j] = '9';
            }
        }
        if (stoi(str) >=100 ) {
            sum += 100;
        }else {
            sum += stoi(str);
        }
    }
    cout << round((double)sum/n);
}
