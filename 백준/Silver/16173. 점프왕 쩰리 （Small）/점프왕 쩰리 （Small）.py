import sys
input = sys.stdin.readline

N = int(input())
smap = []
for i in range(N):
    m = list(map(int,input().split()))
    smap.append(m)

visited = [[False] * N for i in range(N)]

def dfs(x,y):
    visited[x][y]=True

    dx = [smap[x][y],0]
    dy = [0,smap[x][y]]

    for i in range(2):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < N and 0 <= ny < N and visited[nx][ny] == 0:
            dfs(nx, ny)

dfs(0,0)

print('HaruHaru' if visited[N-1][N-1] else 'Hing')