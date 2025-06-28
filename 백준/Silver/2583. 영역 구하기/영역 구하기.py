import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


def fill(x, y, xx, yy):
    for i in range(y, yy):
        for j in range(x, xx):
            mp[i][j] = 1
def dfs(y,x):
    global cnt
    cnt += 1
    mp[y][x] = 1
    for i in range(4):
        ny = dy[i] + y
        nx = dx[i] + x
        if (0 <= nx < n) and (0 <= ny < m) and mp[ny][nx] == 0:
            dfs(ny,nx)
m, n, k = map(int, input().split())
res = []
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
mp = [[0 for i in range(n)] for j in range(m)]
for i in range(k):
    a,b,c,d = map(int,input().split())
    fill(a,b,c,d)

for i in range(m):
    for j in range(n):
        if mp[i][j] == 0:
            cnt = 0
            dfs(i,j)
            res.append(cnt)
print(len(res))
print(*sorted(res))