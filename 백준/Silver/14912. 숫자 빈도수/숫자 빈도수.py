import sys

input = sys.stdin.readline

n, m = map(int, input().split())
cnt = 0
for i in range(1,n + 1):
    w = str(i)
    cnt += w.count(str(m))
print(cnt)
