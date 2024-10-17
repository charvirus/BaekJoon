import sys

input = sys.stdin.readline

L, R = map(int, input().split())

arr = []

for i in range(1, L * R + 1):
    if not (i % L) and not (i % R):
        arr.append(3)
    elif not (i%L):
        arr.append(2)
    elif not (i%R):
        arr.append(1)

print(*arr,sep="")
