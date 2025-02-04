import sys

input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

d = [0] * n
mv = a[0]
for i in range(1, n):
    mv = min(mv, a[i])
    d[i] = max(d[i - 1], a[i] - mv)
print(*d)
