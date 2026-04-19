import sys

input = sys.stdin.readline

for i in range(int(input().strip())):
    maps = dict()
    inp = input().strip()
    inp = inp.replace(" ","")
    for j in inp:
        if j in maps.keys():
            maps[j] += 1
        else:
            maps[j] = 1
    max = 0
    maxCnt = 0
    idx = 0
    chk = 0
    flag = False
    for j in maps.values():
        if max < j:
            max = j
            chk = idx
        idx += 1

    for j in maps.values():
        if max == j:
            maxCnt += 1

    if maxCnt > 1:
        print("?")
    else:
        print(list(maps.keys())[chk])
