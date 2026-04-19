import sys

input = sys.stdin.readline

input()
res = 0
for i in range(2):
    l = list(map(int,input().split()))
    for j in l:
        res += abs(j)
print(res)