import sys

input = sys.stdin.readline

for i in range(int(input())):
    inp = list(input().strip())
    for j in range(len(inp) - 1, 0, -1):
        if int(inp[j]) > 4:
            inp[j - 1] = str(int(inp[j - 1])+1)
        inp[j] = '0'

    print(*inp,sep='')
