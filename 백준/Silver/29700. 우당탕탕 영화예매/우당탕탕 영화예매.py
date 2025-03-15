import sys

input = sys.stdin.readline

n, m, k = map(int, input().split())
cnt = 0
arr = [map(int, input().strip()) for i in range(n)]
for i in arr:
    chk = 0
    for j in i:
        if j == 0:
            chk += 1
        else:
            chk = 0

        if chk >= k:
            cnt += 1
print(cnt)