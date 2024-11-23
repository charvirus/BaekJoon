import sys
input = sys.stdin.readline

n = int(input())
x = sorted(list(map(int, input().split())))
c,i = 0,0
while i < n:
    i += x[i]
    c += 1
print(c)