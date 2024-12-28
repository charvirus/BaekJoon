import sys

input = sys.stdin.readline

n, h, w = map(int, input().split())
sen = [list(input().strip()) for i in range(h)]
res = ""
for x in range(n):
    flag = False
    for i in range(x * w, (x + 1) * w):
        for j in range(h):
            if sen[j][i] != '?' and not flag:
                res += sen[j][i]
                flag = True
                break
    if not flag:
        res += '?'

print(res)