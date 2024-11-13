import sys

input = sys.stdin.readline
T = int(input())
for i in range(T):
    inp = list(map(int, input().strip()))
    for j in range(0, 16, 2):
        idx = int(inp[j])
        if idx * 2 >= 10:
            idx = 1 + (idx * 2 % 10)
        else:
            idx *= 2
        inp[j] = idx
    print("T" if sum(inp) % 10 == 0 else "F")
