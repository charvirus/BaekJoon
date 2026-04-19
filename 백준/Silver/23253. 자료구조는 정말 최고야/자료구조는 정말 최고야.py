import sys

input = sys.stdin.readline

N, M = map(int, input().split())
for i in range(M):
    x = int(input())
    l = list(map(int,input().split()))
    for j in range(x-1):
        if l[j] < l[j+1]:
            print("No")
            exit(0)
print("Yes")