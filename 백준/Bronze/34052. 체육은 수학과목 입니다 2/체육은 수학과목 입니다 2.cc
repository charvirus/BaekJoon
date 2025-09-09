#include<iostream>
#include<string>
using namespace std;

int main() {
    int ans =0,a;
    for (int i = 0;i<4;i++) {
        cin>>a;
        ans += a;
    }
    if (ans<=1500) {
        cout<<"Yes";
    }else {
        cout<<"No";
    }
}
