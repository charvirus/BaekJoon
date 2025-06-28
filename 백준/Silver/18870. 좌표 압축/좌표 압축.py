import sys
input = sys.stdin.readline
n = int(input())
l = list(map(int,input().split()))
sl = sorted(list(set(l)))
m = {}
for i in range(len(sl)):
    m[sl[i]] = i
for i in l:
    print(m[i],end=' ')