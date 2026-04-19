#include <algorithm>
#include <iostream>
using namespace std;
string inp,half,revHalf;
int alpha[26], oddChk;
char oddChar;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> inp;
    for (char c: inp) {
        alpha[c - 'A']++;
    }

    for (int i = 0;i<26;i++) {
        if (alpha[i]%2!=0) {
            oddChk++;
            oddChar = i + 'A';
        }
    }
    if (oddChk > 1) {
        cout<<"I'm Sorry Hansoo";
        return 0;
    }
    for (int i = 0;i<26;i++) {
        half += string(alpha[i]/2,i+'A');
    }
    revHalf = half;
    reverse(revHalf.begin(),revHalf.end());
    if (oddChk) {
        cout<<half+oddChar+revHalf;
    }else {
        cout<<half+revHalf;
    }
}
