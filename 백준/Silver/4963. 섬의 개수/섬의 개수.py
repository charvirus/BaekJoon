import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline

dx = [1, -1, 0, 0, 1, -1, 1, -1]
dy = [0, 0, 1, -1, 1, 1, -1, -1]

def dfs(yy, xx, mw, mh):
    global cnt
    arr[yy][xx] = 0

    for a in range(8):
        nx = xx + dx[a]
        ny = yy + dy[a]
        if (0 <= nx < mw) and (0 <= ny < mh):
            if arr[ny][nx] == 1:
                dfs(ny,nx,mw, mh)


while True:
    cnt = 0
    w, h = map(int, input().split())
    if w == h == 0:
        break
    arr = [list(map(int, input().split())) for i in range(h)]
    for y in range(h):
        for x in range(w):
            if arr[y][x] == 1:
                dfs(y, x, w, h)
                cnt += 1
    print(cnt)
