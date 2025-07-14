#include<iostream>
#include<string>
using namespace std;

string str;
int main() {
    string num = "";
    bool minus = false;
    int sum = 0;
    cin >> str;

    for (int i = 0;i<=str.size();i++) {
        if (str[i] == '+' || str[i] == '-' || str[i] == '\0') {
            if (minus) {
                sum -= stoi(num);
                num="";
            }else {
                sum += stoi(num);
                num="";
            }
        }else {
            num += str[i];
        }
        if  (str[i] == '-') {
            minus = true;
        }
    }
    cout << sum;
}
