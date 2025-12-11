#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n;
    cin >> n;

    if (n!=1) {
        for (int i = n; i >= 0; i--) {

            if (i>=2) {
                cout<< i<<" bottles of beer on the wall, "<<i<<" bottles of beer.\n";
            }else if (i == 1) {
                cout<< i<<" bottle of beer on the wall, "<<i<<" bottle of beer.\n";
            }else {
                cout<<"No more bottles of beer on the wall, no more bottles of beer.\n";
            }

            if (i-1>=2) {
                cout<<"Take one down and pass it around, "<<i-1<<" bottles of beer on the wall.\n";
            }else if (i-1==1) {
                cout<<"Take one down and pass it around, "<<i-1<<" bottle of beer on the wall.\n";
            }else if (i-1 ==0) {
                cout<<"Take one down and pass it around, no more bottles of beer on the wall.\n";
            }else {
                cout<<"Go to the store and buy some more, "<<n<<" bottles of beer on the wall.\n";
            }
            cout<<"\n";
        }
    }else {
        cout<<"1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n\n";
        cout<<"No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 1 bottle of beer on the wall.";
    }
}