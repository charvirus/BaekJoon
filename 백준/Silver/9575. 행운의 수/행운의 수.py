import sys

input = sys.stdin.readline

N = int(input())


def c(x):
    while x:
        if x % 10 not in (5, 8):
            return False
        x //= 10
    return True


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
                if c(i + j + k):
                    chk.add(i + j + k)
    print(len(chk))
