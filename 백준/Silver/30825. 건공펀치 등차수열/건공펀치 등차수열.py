import sys

input = sys.stdin.readline

n, k = map(int, input().split())
l = list(map(int, input().split()))

for i in range(n):
    l[i] -= i*k
lm = max(l)
for i in range(n):
    l[i] -= lm
print(-sum(l))