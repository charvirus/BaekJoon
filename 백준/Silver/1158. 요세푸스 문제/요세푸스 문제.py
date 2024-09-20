import sys

input = sys.stdin.readline

N, K = map(int, input().split())
idx = 0
arr = list(range(1, N + 1))
result = []
while arr:
    idx = (idx + K - 1) % len(arr)
    result.append(arr.pop(idx))
print("<" + ", ".join(map(str, result)) + ">")
