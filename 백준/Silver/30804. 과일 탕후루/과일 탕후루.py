import sys

input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))

k, low, cnt = 0, 0, [0] * 10
ans = 0

for i in range(n):
    cnt[lst[i]] += 1
    if cnt[lst[i]] == 1:
        k += 1
    while k > 2:
        cnt[lst[low]] -= 1
        if cnt[lst[low]] == 0:
            k -= 1
        low += 1
    ans = max(ans, i - low + 1)
print(ans)
