import sys

input = sys.stdin.readline

n = int(input())
ans = 0
coor = [list(map(int, input().split())) for _ in range(n)]

coor.sort(key=lambda x: x[0])
mx = coor[n // 2][0]
coor.sort(key=lambda x: x[1])
my = coor[n // 2][1]

for i in range(n):
    ans += (abs(coor[i][0] - mx) + abs(coor[i][1] - my))
print(ans)
