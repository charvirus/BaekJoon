import sys
import math
def calc(x,y):
    return  math.sqrt(pow(arr[x][0]-arr[y][0],2) + pow(arr[x][1]-arr[y][1],2))

ans = sys.maxsize
arr = [list(map(int,input().split())) for i in range(4)]

input = sys.stdin.readline
tmp = 0
for i in range(1,4):
    for j in range(1,4):
        if  i!=j:
            k = 6-i-j
            tmp = calc(0,i) +  calc(i,j) +  calc(j,k)
            ans=min(tmp,ans)
print(int(ans))

