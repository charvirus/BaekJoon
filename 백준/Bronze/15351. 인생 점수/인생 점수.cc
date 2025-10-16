#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int sum=0;

        string str;
        getline(cin, str);
        for (int i = 0; i < str.length(); i++) {
            if (65 <= str[i] && str[i] <= 90) {
                sum += str[i]-64;
            }
        }
        if (sum == 100) {
            cout<<"PERFECT LIFE\n";
        }else {
            cout<<sum<<"\n";
        }
    }
}
