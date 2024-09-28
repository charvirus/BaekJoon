import sys

input = sys.stdin.readline

N = int(input())
M = 7400000
net = [False for i in range(M + 1)]

for i in range(2, int(M ** 0.5) + 1):
    if not net[i]:
        for j in range(i*i,M+1,i):
            net[j] = True

arr = [i for i in range(2,M+1) if not net[i]]
print(arr[N-1])
