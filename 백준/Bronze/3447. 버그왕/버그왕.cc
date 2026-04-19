#include <cmath>
#include <iostream>
#include <regex>
using namespace std;
string a;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (getline(cin, a)) {
        while (a.find("BUG")!=string::npos) {
            a = regex_replace(a, regex("BUG"), "");
        }
        cout << a << endl;
    }
}