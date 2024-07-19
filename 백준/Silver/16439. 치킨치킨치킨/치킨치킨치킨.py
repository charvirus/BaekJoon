import sys
from itertools import combinations

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [[*map(int, input().split())] for _ in range(n)]

sum = 0
for a, b, c in combinations(range(m), 3):
    tmpSum = 0
    for i in range(n):
        tmpSum += max(arr[i][a], arr[i][b], arr[i][c])
    sum = max(tmpSum, sum)

print(sum)
