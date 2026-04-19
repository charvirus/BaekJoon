import sys

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline


def dfs(y, x):
    global cnt
    cnt += 1
    mp[y][x] = 0
    for i in range(4):
        ny = dy[i] + y
        nx = dx[i] + x
        if (0 <= nx < n) and (0 <= ny < m) and mp[ny][nx] == 1:
            dfs(ny, nx)


m, n = map(int, input().split())
res = []
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
mp = [list(map(int, input().split())) for i in range(m)]

for i in range(m):
    for j in range(n):
        if mp[i][j] == 1:
            cnt = 0
            dfs(i, j)
            res.append(cnt)
print(len(res))
print(max(res) if res else 0)