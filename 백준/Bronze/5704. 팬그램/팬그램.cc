#include <iostream>
#include <string>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);   cout.tie(NULL);
	while (1) {
        bool flag = false;
		string st;
		getline(cin, st);
		if (st == "*") { break; }

		int alpha[26] = { 0 };
		for (int i = 0; i < st.length(); i++) {
			alpha[st[i] - 'a']++;
		}

		int no = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] == 0) {
                flag = true;
                break;
            }
		} 
        if(flag){
            cout<< "N\n";
        }else{
            cout << "Y\n";
        }
    }
}