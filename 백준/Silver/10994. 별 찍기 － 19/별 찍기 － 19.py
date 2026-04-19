import sys

input = sys.stdin.readline


def print_star(s, N):
    if N == 1:
        arr[s][s] = '*'
        return
    else:
        for i in range(s,s+4 * (N - 1) + 1):
            arr[s][i] = '*'
        for i in range(s+1,s+1+4 * (N - 1)):
            arr[i][s] = '*'
            arr[i][s+ 4 * (N - 1)] = '*'
        for i in range(s,s+4 * (N - 1) + 1):
            arr[s+ 4 * (N - 1)][i] = '*'
        print_star(s+2,N-1)

inp = int(input())

arr = []
for i in range((4 * (inp - 1) + 1)):
    arr.append([' '] * (4 * (inp - 1) + 1))

print_star(0,inp)

for i in arr :
    for j in i:
        print(j,end="")
    print()