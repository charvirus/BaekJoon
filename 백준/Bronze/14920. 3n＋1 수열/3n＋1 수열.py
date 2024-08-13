import sys

input = sys.stdin.readline

cnt = 0


def colaz(a):
    global cnt
    cnt += 1
    if a == 1:
        return 0;
    if a % 2 == 0:
        return colaz(a / 2)
    else:
        return colaz(a * 3 + 1)

N = int(input())
colaz(N)
print(cnt)