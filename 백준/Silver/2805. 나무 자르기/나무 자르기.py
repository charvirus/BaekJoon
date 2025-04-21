import sys

input = sys.stdin.readline

n, m = map(int, input().split())
l = list(map(int, input().split()))
s, e = 0, max(l)

while s <= e:
    mid = (s + e) // 2
    cnt = 0
    for i in l:
        if i > mid:
            cnt += i - mid
    if cnt >= m:
        s = mid + 1
    else:
        e = mid - 1
print(e)