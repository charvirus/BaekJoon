#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    string ans, inp;
    cin >> inp;
    for(int i = 0;i<inp.size();i++){
        if(inp[i] == 'E') ans += 'I';
        else if(inp[i] == 'I') ans += 'E';
        else if(inp[i] == 'S') ans += 'N';
        else if(inp[i] == 'N') ans += 'S';
        else if(inp[i] == 'T') ans += 'F';
        else if(inp[i] == 'F') ans += 'T';
        else if(inp[i] == 'P') ans += 'J';
        else ans += 'P';
    }
    cout << ans;
}