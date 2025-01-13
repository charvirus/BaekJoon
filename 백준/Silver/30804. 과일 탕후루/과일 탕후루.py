from collections import defaultdict as defd
import sys
from itertools import count

input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

l, r, cnt = 0, 0, 0
info = defd(int)
ans = 0

while r < n:
    if info[lst[r]] == 0:
        cnt += 1
    info[lst[r]] += 1

    while cnt > 2:
        info[lst[l]] -= 1
        if info[lst[l]] == 0:
            cnt -= 1
        l += 1
    ans = max(ans, r - l + 1)
    r += 1
print(ans)
