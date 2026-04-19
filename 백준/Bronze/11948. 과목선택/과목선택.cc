#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int l1[4], l2[2], sum = 0;
    for(int i=0; i<4; i++){
        cin>>l1[i];
    }
    for(int i=0; i<2; i++){
        cin>>l2[i];
    }
    
    sort(l1, l1+4);
    sort(l2, l2+2);
    
    for(int i=1; i<4; i++){
        sum += l1[i];
    }
    sum += max(l2[0], l2[1]);
    
    cout<<sum;
    return 0;
}