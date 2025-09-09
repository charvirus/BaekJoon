#include <iostream>

using namespace std;


int main() {
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(false);
    int n,x=0,y=0,ix,iy;
    cin>>n;
    for(int i=0;i<n;i++) {
        cin>>ix >> iy;
        x = max(x,min(ix,iy));
        y = max(y,max(ix,iy));
    }
    cout<<(long)x*y<<'\n';
}
