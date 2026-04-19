import sys

input = sys.stdin.readline
result = []
n = int(input())
for i in range(n):
    result.append(int(input()))
result.sort(reverse=True)

for i in range(n):
    result[i]*=(i+1)
print(max(result))