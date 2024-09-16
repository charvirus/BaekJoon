import sys

input = sys.stdin.readline

n, m, x = map(int, input().split())
mountain = list(map(int, input().split()))
x = x - 1
map = [['.'] * m for i in range(n)]

for i in range(m):
    for j in range(mountain[i]):
        map[~j][i] = '#'
    if i % 3 == 2:
        for j in range(mountain[i], x):
            map[~j][i] = '|'

for i in range(m):
    if map[~x][i] == '#':
        map[~x][i] = '*'
    else:
        map[~x][i] = '-'

for row in map:
    print(''.join(row))