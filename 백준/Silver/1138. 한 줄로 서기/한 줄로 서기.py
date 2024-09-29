import sys

input = sys.stdin.readline

N = int(input())
line = list(map(int,input().split()))
hl = list(range(1,N+1))
result = []
j = -1
for i in range(N):
    result.insert(line[j], hl[j])
    j -= 1

for i in result:
    print(i, end=' ')