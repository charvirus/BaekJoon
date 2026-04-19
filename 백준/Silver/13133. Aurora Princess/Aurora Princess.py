import sys

input = sys.stdin.readline

cnt = 0
n = int(input())
arr = [[1, 1] for i in range(n)]
doa = [False] * n
for i in range(n):
    a, b = map(int, input().split())
    arr[i][0] = a
    arr[i][1] = b
m = int(input())
ck = list(map(int, input().split()))
for i in ck:
    doa[i - 1] = True
for i in range(n):
    if not doa[i]:
        if arr[i][0] != 0 and arr[i][1] != 0:
            if not doa[arr[i][0] - 1] and not doa[arr[i][1] - 1]:
                cnt += 1
print(cnt)
