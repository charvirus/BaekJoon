import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    TM, MD, WD = map(int, input().split())
    result = 0
    cnt = 0
    for j in range(TM):
        if (MD + cnt) % WD == 0:
            result += (MD + cnt) // WD
        else:
            result += ((MD + cnt) // WD) + 1
            cnt = (MD + cnt) % WD
    print(f'Case #{i + 1}: {int(result)}')
