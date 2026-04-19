import sys

input = sys.stdin.readline
n, m = map(int, input().split())
s = list()
o = list()

for _ in range(m):
    a, b = map(int, input().split())
    s.append(a)
    o.append(b)

s = min(s)
o = min(o)

if s / 6 < o:
    if s < (n % 6) * o:
        print((n // 6) * s + s)
    else:
        print((n // 6) * s + (n % 6) * o)
else:
    print(o * n)
