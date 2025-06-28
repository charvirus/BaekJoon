import sys

input = sys.stdin.readline

n, m, a, b = map(int, input().split())
t = [*map(int, input().split())]
l = set(map(int, input().split()))
h = set(map(int, input().split()))

like, p = 0, 0
for i in range(n):
    if t[i] in l:
        p += 1
    else:
        if p >= 3:
            like += p
        p = 0
if p >= 3:
    like += p
p = 0

for i in range(n):
    if t[i] in h:
        p += 1
    else:
        if p >= 3:
            like -= p
        p = 0
if p >= 3:
    like -= p

print(like)
