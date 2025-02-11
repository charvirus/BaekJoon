import sys
input = sys.stdin.readline

def chk(M, N, x, y):
    while x <= M * N:
        if (x - y) % N == 0:
            return x
        x += M
    return -1

n = int(input())
for i in range(n):
    M, N, x, y = map(int, input().split())
    print(chk(M, N, x, y))