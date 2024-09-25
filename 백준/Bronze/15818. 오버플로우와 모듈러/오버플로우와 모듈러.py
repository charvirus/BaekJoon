import sys

input = sys.stdin.readline

N, M = map(int, input().split())
nlist = list(map(int, input().split()))

result = 1
for i in nlist:
    result = ((i % M) * (result % M)) % M

print(result)
