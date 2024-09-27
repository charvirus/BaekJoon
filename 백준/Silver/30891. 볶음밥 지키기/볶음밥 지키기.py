import math
import sys

input = sys.stdin.readline

N, R = map(int, input().split())
rice = [list(map(int, input().split())) for i in range(N)]

cnt = 0
rx, ry = 0, 0

for i in range(-100, 101):
    for j in range(-100, 101):
        tmpCnt = 0
        for x, y in rice:
            if (i - x) ** 2 + (j - y) ** 2 <= R * R:
                tmpCnt += 1

        if cnt < tmpCnt:
            cnt = tmpCnt
            rx, ry = i, j

print(rx, ry)
