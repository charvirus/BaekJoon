#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int r, c, t, n, m;
    cin >> r >> c;
    cin >> t;
    vector<int> w, h,nw,nh;
    w.push_back(0);
    h.push_back(0);
    w.push_back(c);
    h.push_back(r);
    while (t--) {
        cin >> n >> m;
        if (n)
            h.push_back(m);
        else
            w.push_back(m);
    }
    sort(w.begin(), w.end());
    sort(h.begin(), h.end());
    for (int i = 1; i < w.size(); i++) nw.push_back(w[i] - w[i-1]);
    for (int i = 1; i < h.size(); i++) nh.push_back(h[i] - h[i-1]);
    sort(nw.begin(), nw.end());
    sort(nh.begin(), nh.end());
    cout<< nw[nw.size()-1]*nh[nh.size()-1] << endl;
}
