import sys

input = sys.stdin.readline

n, m = map(int, input().split())

arr = [list(map(int, input().split())) for i in range(n)]
dp = [[0] * (n + 1) for i in range(n + 1)]

for y in range(1, n + 1):
    for x in range(1, n + 1):
        dp[y][x] = dp[y][x - 1] + dp[y - 1][x] - dp[y - 1][x - 1] + arr[y - 1][x - 1]

for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())

    ans = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1]

    print(ans)
