#include <algorithm>
#include <iostream>
#include <map>
#include <sstream>
#include <vector>
using namespace std;

int t;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> t;
    while (t--) {
        string buffer;
        getline(cin, buffer);

        string input;
        getline(cin, input);

        stringstream ss(input);
        vector<string> tokens;
        string word;

        while (ss >> word) {
            tokens.push_back(word);
        }

        while (true) {
            string a,b,c;
            cin >> a;
            if (a =="what") break;
            cin >> b >> c;
            tokens.erase(remove(tokens.begin(), tokens.end(), c), tokens.end());
        }
        for (int i = 0; i < tokens.size(); i++) {
            cout << tokens[i] << " ";
        }cout<<"\n";
    }
}
