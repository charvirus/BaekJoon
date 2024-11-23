import sys

input = sys.stdin.readline

n = int(input())
light = list(map(int, input().split()))
cur = [False] * n
cnt = 0
for i in range(n):
    if cur[i] != light[i]:
        cnt += 1
        cur[i] = not cur[i]
        if i + 1 < n:
            cur[i + 1] = not cur[i + 1]
        if i + 2 < n:
            cur[i + 2] = not cur[i + 2]
print(cnt)
