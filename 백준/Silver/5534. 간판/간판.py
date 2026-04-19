import sys

input = sys.stdin.readline


def chk(bd):
    l = len(bd)
    for st in range(l):
        if bd[st] == name[0]:
            for en in range(st, l):
                if bd[en] == name[-1]:
                    gap = (en - st) // (ln - 1)
                    cnt = 0
                    while cnt < ln:
                        if bd[st + gap * cnt] == name[cnt]:
                            cnt += 1
                            continue
                        break
                    else:
                        return 1
    return 0


n = int(input())
name = input().strip()
ln = len(name)
boards = list(input().strip() for _ in range(n))
res = 0
for bd in boards:
    res += chk(bd)
print(res)
