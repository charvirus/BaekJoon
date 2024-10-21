import sys

input = sys.stdin.readline

N, K = map(int, input().split())
track = list(map(int, input().split()))
cnt = 0
total = sum(track)
if total < K:
    K -= total
    cnt = N
    while K > 0:
        cnt -= 1
        K -= track[cnt]
else:
    while K >= track[cnt]:
        K -= track[cnt]
        cnt += 1
print(cnt + 1)
