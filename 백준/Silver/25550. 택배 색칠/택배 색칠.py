n, m = map(int, input().split())
a = [list(map(int, input().split())) for i in range(n)]
cnt = 0
for i in range(1, n - 1):
    for j in range(1, m - 1):
        cnt += max(0, min(a[i][j] - 1, a[i - 1][j], a[i + 1][j], a[i][j - 1], a[i][j + 1]))
print(cnt)
