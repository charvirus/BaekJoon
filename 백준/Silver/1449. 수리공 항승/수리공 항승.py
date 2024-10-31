import sys

input = sys.stdin.readline

m, k = map(int, input().split())
l = list(map(int, input().split()))
l.sort()
cnt = 1
temp = l[0]
for i in range(1, m):
    if l[i] - temp >= k:
        cnt += 1
        temp = l[i]
print(cnt)
