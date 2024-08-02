import sys

N = int(sys.stdin.readline())
nameList = [sys.stdin.readline().split() for i in range(N)]

nameList.sort()
maps = {}

for i in nameList:
    if i[0] in maps.keys():
        maps[i[0]].append(i[1])
    else:
        maps[i[0]] = [i[1]]

for i in maps:
    maps[i].sort(reverse=True)

for i in maps:
    for j in maps[i]:
        print(i, j)
