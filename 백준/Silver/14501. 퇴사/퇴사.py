import sys

input = sys.stdin.readline

n = int(input())

sch = [list(map(int, input().split())) for i in range(n)]

dp = [0 for i in range(n + 1)]

for i in range(n):
    for j in range(i + sch[i][0], n + 1):
        if dp[j] < dp[i] + sch[i][1]:
            dp[j] = dp[i] + sch[i][1]
print(dp[n])