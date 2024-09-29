import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    wcnt = 0
    left = 0
    TM, MD, WD = map(int, input().split())
    for j in range(TM):
        if (left + MD) % WD == 0:
            wcnt += (left + MD) // WD
        else:
            wcnt += (left + MD) // WD + 1
            left = (left + MD) % WD
    print(f'Case #{i+1}: {wcnt}')