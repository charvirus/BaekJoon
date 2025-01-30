from collections import deque
import sys

input = sys.stdin.readline

dy = [0, 0, 1, -1]
dx = [1, -1, 0, 0]

N, M = map(int, input().split())
arr = [list(map(int, input().split())) for i in range(N)]
v = [[-1] * M for _ in range(N)]

def bfs(x,y):
    q = deque()
    q.append((x,y))
    v[x][y] = 0
    while q:
        cx,cy = q.popleft()
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < N and 0 <= ny < M and v[nx][ny] == -1:
                if arr[nx][ny] == 0:
                    v[nx][ny] = 0
                elif arr[nx][ny]==1:
                    v[nx][ny] = v[cx][cy] + 1
                    q.append((nx, ny))




for i in range(N):
    for j in range(M):
        if arr[i][j] == 2 and v[i][j] == -1:
            bfs(i,j)

for i in range(N):
    for j in range(M):
        print( v[i][j] if arr[i][j] else 0, end=' ')
    print()