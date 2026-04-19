import sys

input = sys.stdin.readline


def bfs(x, y):
    global X, Y, center

    queue = [[0, 0]]
    center[y][x] = 2
    dx = [1, 0]
    dy = [0, 1]
    while queue:
        d = queue.pop(0)
        cy = d[0]
        cx = d[1]
        for i in range(2):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < X and 0 <= ny < Y and center[ny][nx] == 1:
                center[ny][nx] = 2
                queue.append([ny, nx])


X, Y = map(int, input().split())
center = []
for i in range(Y):
    inp = list(map(int, input().split()))
    center.append(inp)

bfs(0, 0)

print("Yes" if center[Y-1][X-1] == 2 else "No")
