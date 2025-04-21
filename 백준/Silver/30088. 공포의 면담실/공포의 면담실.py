import sys

input = sys.stdin.readline

n = int(input())
arr = []
for i in range(n):
    l = list(map(int,input().split()))
    arr.append(sum(l[1:]))
arr.sort()
for i in range(1,n):
    arr[i] = arr[i] + arr[i-1]
print(sum(arr))