import sys

input = sys.stdin.readline

n = int(input())
x = sorted(list(map(int, input().split())))
cnt = 0
i = 0
while i<n:
    i += x[i]
    cnt += 1
print(cnt)
