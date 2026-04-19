import sys
input =  sys.stdin.readline
n = int(input())
arr = [list(map(int, input().strip())) for i in range(n)]

dy=[1,-1,0,0]
dx=[0,0,1,-1]
def dfs(y,x):
    if x < 0 or x >= n or y < 0 or y >= n:
        return False
    if arr[y][x] == 1:
        global cnt
        cnt += 1
        arr[y][x] = 0
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            dfs(ny,nx)

apt = 0
c = []
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            apt += 1
            cnt = 0
            dfs(i,j)
            c.append(cnt)

print(apt,*sorted(c),sep="\n")