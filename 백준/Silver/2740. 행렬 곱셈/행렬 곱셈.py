import sys

input = sys.stdin.readline

A, B = [], []
y, x = map(int, input().split())
for _ in range(y):
    A.append(list(map(int, input().split())))
yy, xx = map(int, input().split())
for _ in range(yy):
    B.append(list(map(int, input().split())))

ans = []
for i in range(y):
    l = []
    for j in range(xx):
        an = 0
        for k in range(x):
            an += A[i][k] * B[k][j]
        l.append(an)
    ans.append(l)
for i in ans:
    print(*i)