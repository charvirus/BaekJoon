import sys

input = sys.stdin.readline

n = int(input())
l = [float(input()) for _ in range(n)]
for i in range(1, n):
    l[i] = max(l[i], l[i - 1] * l[i])
print("%.3f" % max(l))