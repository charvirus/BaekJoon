import sys

input = sys.stdin.readline

for i in range(int(input().strip())):
    m, n = map(int, input().split())
    grid = [list(map(int,input().split())) for _ in range(m)]

    cnt = 0

    for j in range(n):
        bottom = m - 1
        for k in reversed(range(m)):
            if grid[k][j] == 1:
                cnt += bottom - k
                bottom -= 1

    print(cnt)