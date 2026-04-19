#include <algorithm>
#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    while (true) {
        int p;
        cin >> p;
        if (p == 0) {
            break;
        }
        vector<int> arr(p + 1);;
        string s;
        cin.ignore();
        getline(cin, s);
        stringstream ss(s);
        string page;
        while (getline(ss, page, ',')) {
            int low, high;
            if (page.find('-') == string::npos) {
                low = high = stoi(page);
            } else {
                size_t pos = page.find('-');
                low = stoi(page.substr(0, pos));
                high = stoi(page.substr(pos + 1));
            }
            if (low > high) {
                continue;
            }
            for (int i = low; i <= high; i++) {
                if (i >= arr.size()) continue;
                arr[i] = 1;
            }
        }
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        cout << sum << "\n";
    }
}
