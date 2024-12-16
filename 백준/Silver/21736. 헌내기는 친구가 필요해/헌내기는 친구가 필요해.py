import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def dfs(y,x):
    global cnt
    vst[y][x] = True
    if arr[y][x] == "P":
        cnt += 1
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if (0 <= nx < w) and (0 <= ny < h) and not vst[ny][nx]:
            if arr[ny][nx] != "X":
                dfs(ny,nx)

cnt = 0
h,w = map(int,input().split())
arr = [list(input().strip()) for i in range(h)]
vst = [[False]*w for _ in range(h)]
for y in range(h):
    for x in range(w):
        if arr[y][x] == "I":
            dfs(y,x)

print(cnt if cnt else "TT")