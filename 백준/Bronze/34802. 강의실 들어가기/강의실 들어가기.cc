#include <iostream>
using namespace std;
string curTime, arrTime;

int curSec, arrSec;
int t, r;

int timeToSec(string time) {
    int hourSec = stoi(time.substr(0, 2)) * 3600;
    int minuteSec = stoi(time.substr(3, 2)) * 60;
    int secondSec = stoi(time.substr(6, 2));
    return hourSec + minuteSec + secondSec;
}

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> curTime >> arrTime;
    curSec = timeToSec(curTime);
    arrSec = timeToSec(arrTime);

    cin >> t >> r;

    int addSecond = t * (100-r)/100;
    cout << (curSec + addSecond <= arrSec);
}
