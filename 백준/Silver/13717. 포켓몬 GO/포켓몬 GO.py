import sys

input = sys.stdin.readline

pl = []
m = 0
lvm = 0
for i in range(int(input())):
    n = 0
    name = input().strip()
    lv, candy = map(int, input().split())
    while lv <= candy:
        candy = candy - lv + 2
        n += 1
    m += n
    pl.append([n, name])
    lvm = max(n, lvm)

print(m)
for i in pl:
    if i[0] == lvm:
        print(i[1])
        break
