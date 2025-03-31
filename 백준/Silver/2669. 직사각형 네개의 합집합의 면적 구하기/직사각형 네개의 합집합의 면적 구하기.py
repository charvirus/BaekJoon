import sys

arr = [[0] * 101 for i in range(101)]

total = 0

for i in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for y in range(y1, y2):
        for x in range(x1, x2):
            arr[y][x] = 1

for i in arr:
    total += sum(i)

print(total)