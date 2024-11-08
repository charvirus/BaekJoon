import sys

input = sys.stdin.readline

N = int(input())

for _ in range(N):
    l = []
    chk = set()
    cnt = 0
    for i in range(3):
        input()
        l.append(set(list(map(int, input().split()))))

    for i in l[0]:
        for j in l[1]:
            for k in l[2]:
                txt = str(i + j + k)
                txt = txt.replace('5', '')
                txt = txt.replace('8', '')
                if txt == "":
                    chk.add(i + j + k)
    print(len(chk))