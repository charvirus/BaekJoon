#include <cmath>
#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    string str;
    int st = 0, en = 0;
    getline(cin, str);
    
    while (true) {
        st = str.find("What is", st);
        if (st == string::npos) {
            break;
        }
        en = str.find_first_of("?.", st);
        string substr = str.substr(st + 4, en - st - 3);
        if (substr.back() == '?') {
            substr.pop_back();
            cout << "Forty-two" << substr << ".\n";
        }
        st = en;
    }
}
