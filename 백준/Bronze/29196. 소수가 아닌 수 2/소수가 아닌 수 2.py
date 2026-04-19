import sys

input = sys.stdin.readline

f = float(input().strip())

p, q = 1, 1
while (abs(p / q - f) > 10 ** -6):
    if p / q > f:
        q += 1
    else:
        p += 1
print("YES")
print(p,q)