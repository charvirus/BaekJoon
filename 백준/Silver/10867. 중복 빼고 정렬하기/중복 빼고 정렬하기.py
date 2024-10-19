import sys

input = sys.stdin.readline

N = int(input())

inp = map(int,input().split())
arr = []
for i in inp:
    if i not in arr:
        arr.append(i)
arr.sort()
print(*arr)