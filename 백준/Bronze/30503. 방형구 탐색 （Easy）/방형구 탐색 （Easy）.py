import sys

input = sys.stdin.readline

n = int(input())
flw = list(map(int, input().split()))
q = int(input())
for i in range(q):
    cnt = 0
    inp = list(map(int, input().split()))
    if inp[0] == 1:
        for i in range(inp[1]-1, inp[2]):
            if flw[i] == inp[3]:
                cnt += 1
        print(cnt)
    elif inp[0] == 2:
        for i in range(inp[1]-1, inp[2]):
            flw[i] = 0