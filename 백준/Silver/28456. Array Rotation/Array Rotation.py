import sys

input = sys.stdin.readline

arr = []
N = int(input())
for i in range(N):
    arr.append(list(map(int, input().split())))
Q = int(input())
for i in range(Q):
    inp = list(map(int, input().split()))
    if inp[0] == 1:
        idx = arr[inp[1] - 1].pop()
        arr[inp[1] - 1].insert(0,idx)
    else:
        rot = [[0] * N for i in range(N)]
        for i in range(N):
            for j in range(N):
                rot[j][N-i-1] = arr[i][j]
        arr = rot
for i in arr:
    print(*i)
