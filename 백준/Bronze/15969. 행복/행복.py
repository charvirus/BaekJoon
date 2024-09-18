import sys

input = sys.stdin.readline

time = int(input())
scores = list(map(int, input().split()))
smax = 0
smin = sys.maxsize

for i in scores:
    if i > smax:
        smax = i
    if i < smin:
        smin = i
print(smax - smin)
