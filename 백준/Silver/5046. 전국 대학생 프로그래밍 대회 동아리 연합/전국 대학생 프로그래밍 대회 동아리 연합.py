import sys

input = sys.stdin.readline

N, B, H, W = map(int, input().split())
result = B + 1
for i in range(H):
    p = int(input())
    week = list(map(int, input().split()))
    if N * p <= B and max(week) >= N:
        result = min(N * p, result)

print("stay home" if result == B + 1 else result)
