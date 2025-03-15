import copy
import sys

input = sys.stdin.readline

cnt = 0
n, m, k = map(int, input().split())
row = [0] + list(input().strip())
rc = copy.deepcopy(row)

for i in range(1, n + 1):
    if row[i] == 'R':
        t, g = max(1, i - k), min(n, i + k)
        for j in range(t, g + 1):
            rc[j] = 'R'

if rc.count('R') <= m:
    print("Yes")
else:
    print("No")
