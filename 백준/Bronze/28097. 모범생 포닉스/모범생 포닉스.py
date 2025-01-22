import sys

input = sys.stdin.readline

d, h = 0, 0
n = int(input())
sl = list(map(int, input().split()))

if n < 2:
    d = sl[0] // 24
    h = sl[0] % 24
else:
    tt = sum(sl) + (n-1)*8
    d = tt // 24
    h = tt % 24
print(d,h)