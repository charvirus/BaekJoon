import sys

input = sys.stdin.readline

x, y = 0, 0
n = int(input())
m = [list(input().strip()) for i in range(n)]
for i in range(n):
    cnt = 0
    flag = True
    for j in range(n):
        if m[i][j] == '.':
            cnt += 1
        else:
            cnt = 0
            flag = True
        if cnt >= 2 and flag:
            x += 1
            flag = False
for i in range(n):
    cnt = 0
    flag = True
    for j in range(n):
        if m[j][i] == '.':
            cnt += 1
        else:
            cnt = 0
            flag = True
        if cnt >= 2 and flag:
            y += 1
            flag = False
print(x, y)
