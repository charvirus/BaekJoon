import sys

input = sys.stdin.readline

N, M = map(int, input().split())
a = [[] for _ in range(N)]

for i in range(N):
    a[i] = list(map(int, input().strip()))

ans = []

if N >= M:
    size = M
else:
    size = N

i, j = 0, 0

while size > 0:
    if a[i][j] == a[i + size - 1][j] == a[i][j + size - 1] == a[i + size - 1][j + size - 1]:
        ans.append(size ** 2)
    j += 1
    if j + size - 1 >= M:
        j = 0
        i += 1

    if i + size - 1 >= N:
        i = 0
        j = 0
        size -=1
print(max(ans))
