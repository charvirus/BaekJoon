import sys

input = sys.stdin.readline

n = int(input())
l = list(map(int,input().split()))
sl = sorted(l)
m = {}
idx = 0
for i in sl:
    if i not in m :
        m[i] = idx
        idx += 1
for i in l:
    print(m[i],end=' ')