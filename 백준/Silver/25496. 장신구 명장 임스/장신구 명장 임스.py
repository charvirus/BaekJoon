import sys

input = sys.stdin.readline

p,n = map(int,input().split())
l = sorted(list(map(int,input().split())))
cnt = 0

for i in range(n):
    if p < 200:
        p += l[i]
        cnt += 1

print(cnt)