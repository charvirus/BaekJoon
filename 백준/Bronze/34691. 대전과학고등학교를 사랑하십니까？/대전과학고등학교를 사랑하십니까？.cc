#include <iostream>
using namespace std;


int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (1) {
        string inp;
        cin>>inp;
        if (inp == "end") {
            break;
        }else if (inp == "animal") {
            cout<<"Panthera tigris\n";
        }else if (inp == "flower") {
            cout<<"Forsythia koreana\n";
        }else if (inp == "tree") {
            cout<<"Pinus densiflora\n";
        }
    }
}
