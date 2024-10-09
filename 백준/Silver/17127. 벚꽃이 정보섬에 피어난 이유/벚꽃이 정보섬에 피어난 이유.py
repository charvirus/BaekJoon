import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
t = 1

def mul(a, b, arr):
    mul = 1
    for i in range(a, b):
        mul *= arr[i]
    return mul

def sum(i, j, k, l, arr):
    return mul(i, j, arr) + mul(j, k, arr) + mul(k, l, arr) + mul(l, len(arr), arr)

for j in range(1, n - 2):
    for k in range(j + 1, n - 1):
        for l in range(k + 1, n):
            t = max(sum(0, j, k, l, arr), t)

print(t)
