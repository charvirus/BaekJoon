import math
import sys

input = sys.stdin.readline

ans = sys.maxsize
N, K, A = map(int, input().split())
for i in range(N):
    t, s = map(int, input().split())

    ans = min(ans,(math.ceil(K/A/t)-1)*s + (K/A))

print(int(ans))
