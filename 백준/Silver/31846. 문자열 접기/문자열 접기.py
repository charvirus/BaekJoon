import sys

input = sys.stdin.readline

N = int(input())
S = input().strip()
Q = int(input())
for i in range(Q):
    cmax = 0
    l, r = map(int, input().split())
    piece = S[l - 1:r]
    plen = len(piece)
    for j in range(plen):
        cnt = 0
        first = piece[:j + 1]
        second = piece[:j:-1]
        flen, slen = len(first), len(second)
        for k in range(min(flen, slen)):
            if first[flen - 1 - k] == second[slen - 1 - k]:
                cnt += 1
        cmax = max(cmax, cnt)
    print(cmax)
