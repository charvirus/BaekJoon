import sys

input = sys.stdin.readline

n, m, b = map(int, input().split())
mp = [list(map(int, input().split())) for i in range(n)]

ans, glvl = int(1e9), 0

for i in range(257):
    use_block, take_block = 0, 0
    for x in range(n):
        for y in range(m):
            if mp[x][y] > i:
                take_block += mp[x][y] - i
            else:
                use_block += i - mp[x][y]
    if use_block > take_block + b:
        continue
    count = take_block * 2 + use_block
    if count <= ans:
        ans = count
        glvl = i
print(ans,glvl)
