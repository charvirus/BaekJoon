import sys

input = sys.stdin.readline

N = int(input())
dp = [0] * 10001
dp[1] = 1
dp[2] = 1
dp[3] = 2
for i in range(4, 10001):
    dp[i] = dp[i - 1] + dp[i - 2]

for i in range(N):
    q, p = map(int, input().split())
    print(f'Case #{i + 1}: {dp[q] % p}')
