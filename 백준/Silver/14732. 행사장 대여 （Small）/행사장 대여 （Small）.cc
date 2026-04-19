// Problem Solving.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

int main()
{
    int n, x1, x2, y1, y2,sum=0,minx=500,miny=500,maxx=0,maxy=0;
    int arr[500][500] = { 0, };
    cin >> n;
    for (int i = 0;i < n;i++) {
        cin >> x1 >>  y1 >> x2 >> y2;
        minx = min(x1, minx);
        miny = min(y1, miny);
        maxx = max(x2, maxx);
        maxy = max(y2, maxy);
        
        for (int sy = y1;sy < y2;sy++) {
            for (int sx = x1;sx < x2;sx++) {
                arr[sy][sx]=1;
            }
        }
    }
    for (int i = miny;i < maxy;i++) {
        for (int j = minx;j < maxx;j++) {
            sum += arr[i][j];
        }
    }

    cout << sum;
}

