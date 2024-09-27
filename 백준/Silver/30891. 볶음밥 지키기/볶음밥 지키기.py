import math
import sys

input = sys.stdin.readline

N, R = map(int, input().split())
xList = []
yList = []
for i in range(N):
    x, y = map(int, input().split())
    xList.append(x)
    yList.append(y)
minX = min(xList)
maxX = max(xList)

cnt = 0
rx, ry = 0, 0

for i in range(minX,maxX+1):
    for j in range(minX,maxX+1):
        tmpCnt = 0
        for x,y in zip (xList,yList):
            r = math.sqrt(((i-x)**2)+((j-y)**2))
            if r <= R:
                tmpCnt += 1

        if cnt < tmpCnt:
            cnt = tmpCnt
            rx = i
            ry = j

print(rx,ry)