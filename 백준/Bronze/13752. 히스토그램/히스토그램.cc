#include <iostream>
using namespace std;

int _N, _Temp;
int main() 
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> _N;
    for (int i = 0; i < _N; i++) {
        cin >> _Temp;
        string _Str;
        for (int j = 0; j < _Temp; j++) _Str.push_back('=');    
        cout << _Str << "\n";
    }

}