#include <iostream>
#include <string>

using namespace std;


int main(void) {
    string a;
    while (true) {
        getline(cin, a);
        if (cin.eof()) break;
        cout << a << "\n";
    }
    return 0;
}
