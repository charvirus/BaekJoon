import sys

input = sys.stdin.readline

N = int(input())

for i in range(N):
    out = 0
    inp = int(input())
    if inp % 2 == 0:
        out += inp // 2
    else:
        out += (inp // 2) + 1

    if inp % 6 == 0 or inp % 6 == 4:
        out += inp // 3
    else:
        out += (inp // 3) + 1

    print(int(out))
