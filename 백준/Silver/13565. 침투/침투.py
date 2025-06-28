import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

dy = [1, -1, 0, 0]
dx = [0, 0, 1, -1]


def dfs(y, x):
    mp[y][x] = 2
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny and ny < m and 0 <= nx and nx < n and mp[ny][nx] == 0:
            dfs(ny,nx)


m, n = map(int, input().split())
mp = [list(map(int, input().strip())) for i in range(m)]
for i in range(n):
        if mp[0][i] == 0:
            dfs(0,i)
if 2 in mp[m-1]:
    print("YES")
else:
    print("NO")