import sys

input = sys.stdin.readline

N = int(input())
dp = [0] * 1001
dp[1] = 0
dp[2] =1
dp[3] = 0
dp[4] = 1
for i in range(5, N + 1):
    dp[i] = (min(dp[i - 1], min(dp[i - 3], dp[i - 4])) + 1) % 2

if dp[N]:
    print("SK")
else:
    print("CY")
