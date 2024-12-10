import sys
from collections import deque
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def bfs(yy, xx):
    que = deque()
    que.append((yy,xx))
    while que:
        y,x = que.popleft()
        for a in range(4):
            ny = y + dy[a]
            nx = x + dx[a]
            if 0<=ny<N and 0<=nx<M and g[ny][nx] == 1:
                que.append((ny,nx))
                g[ny][nx] = g[y][x] + 1

dy = [0, 0, 1, -1]
dx = [1, -1, 0, 0]

N, M = map(int, input().split())
g = [list(map(int, list(input().strip()))) for i in range(N)]
bfs(0,0)
print(g[N - 1][M - 1])
