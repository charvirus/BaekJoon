import sys

input = sys.stdin.readline

n = int(input().strip())
cnt = 0

for i in range(n + 1):
    for j in range(i + 1):
        cnt += i + j

print(cnt)
