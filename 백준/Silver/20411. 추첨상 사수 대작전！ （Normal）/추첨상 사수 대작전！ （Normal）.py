import sys

input = sys.stdin.readline
m, seed, x1, x2 = map(int, input().split())

for a in range(m):
    c = (x1 - a * seed % m + m)%m
    if x1 == (a * seed + c) % m and x2 == (a * x1 + c) % m:
        print(a, c)
        exit()