#include <cmath>
#include <iostream>
#include <map>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, p, w, l, g,curp=0;
    cin >> n >> p;
    cin >> w >> l >> g;
    map<string,int> mp;
    for (int i = 0;i<p;i++) {
        string name,res;
        cin >> name>>res;
        if (res=="W") {
            mp[name] = w;
        }else {
            mp[name] = -l;
        }
    }

    for (int i = 0;i<n;i++) {
        string name;
        cin >> name;
        if (curp >=g) {
            break;
        }
        if (curp<0) {
            curp=0;
        }

        if (mp.find(name) != mp.end()) {
            curp += mp[name];
        }else {
            curp -= l;
        }
    }
    if (curp>=g) {
        cout<<"I AM NOT IRONMAN!!";
    }else {
        cout<<"I AM IRONMAN!!";
    }
}
