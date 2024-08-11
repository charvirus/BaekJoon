import sys

N = int(sys.stdin.readline().strip())
ans = 0
for i in range(N):
    ans += N * i + i

print(ans)
