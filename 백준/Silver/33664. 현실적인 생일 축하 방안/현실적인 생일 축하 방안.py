import sys

input = sys.stdin.readline

b, n, m = map(int, input().split())
l = {}
t = 0
for _ in range(n):
    i, p = input().split()
    l[i] = int(p)

for _ in range(m):
    i = input().strip()
    t += l[i]

print("acceptable" if t <=b else "unacceptable")