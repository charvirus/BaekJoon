import sys

input = sys.stdin.readline

n = int(input())
for i in range(n):
    a, b = input().split()
    c = int(a) * int(b)
    al, bl = len(a), len(b)

    if al < bl:
        a = a.rjust(bl, '1')
    else:
        b = b.rjust(al, '1')
    d = int(''.join([str(int(a) * int(b)) for a, b in zip(a, b)]))
    print(1 if c == d else 0)
