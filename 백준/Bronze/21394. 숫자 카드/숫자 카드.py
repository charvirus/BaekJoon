import sys

input = sys.stdin.readline

n = int(input())
for i in range(n):
    nl = list(map(int, input().split()))
    nl[8] += nl[5]
    nl[5] = 0
    s = ""
    for j in range(8, -1, -1):
        s += (str(j + 1) * nl[j])
    c = 0
    sl = len(s)
    if sl %2 == 0:
        for j in range(0, sl, 2):
            print(s[j], end=' ')
        for j in range(sl - 1, -1, -2):
            print(s[j], end=' ')
    else:
        for j in range(0, sl, 2):
            print(s[j], end=' ')
        for j in range(sl - 2, 0, -2):
            print(s[j], end=' ')
    print()
