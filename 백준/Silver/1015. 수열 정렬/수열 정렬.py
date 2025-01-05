import sys

input = sys.stdin.readline

n= int(input())
l = list(map(int, input().split()))
dl = l.copy()
dl.sort()

for i in range(n):
    for j in range(n):
        if l[i] == dl[j]:
            print(j,end=" ")
            dl[j] -= 1
            break