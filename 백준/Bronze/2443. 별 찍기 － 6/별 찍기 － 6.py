import sys

input = sys.stdin.readline

N = int(input())
for i in range(N):
    print(" " * i, end="")
    print("*" * (N * 2 - 1 - (i * 2)))
