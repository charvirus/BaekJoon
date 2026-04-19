import sys

input = sys.stdin.readline

n, L = map(int, input().split())
x = list(map(int, input().split()))

s = 0
flag = False
for i in range(n - 1, 0, -1):
    s += x[i]
    if x[i - 1] - L < s / (n - i) < x[i - 1] + L:
        flag = False
    else:
        flag = True
        break
if flag:
    print("unstable")
else:
    print("stable")
