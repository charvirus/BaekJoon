import sys

input = sys.stdin.readline

n = int(input())
lst = [int(input()) for i in range(n)]
s=0
for i in range(n-1, 0,-1):
    if lst[i] <= lst[i - 1]:
        s += (lst[i-1]-lst[i]+1)
        lst[i-1] = lst[i]-1
print(s)