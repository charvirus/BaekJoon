import sys

input = sys.stdin.readline

n, m = map(int, input().split())
ls = list(map(int, input().split()))

s, e = 0, 1
cnt = 0
while s <= e <= n:
    ttl = sum(ls[s:e])
    if ttl == m:
        cnt += 1
        e += 1
    elif ttl < m:
        e += 1
    else:
        s += 1
print(cnt)
