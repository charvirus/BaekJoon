import sys

input = sys.stdin.readline

N, K = map(int, input().split())
temper = list(map(int, input().split()))
arr = [0] * (N - K + 1)
result = -100 * N
for i in range(N - K + 1):
    arr[i] = sum(temper[i:i + K])

for i in range(N - K + 1):
    if result < arr[i]:
        result = arr[i]
print(result)
