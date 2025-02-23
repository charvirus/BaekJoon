import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [[] for _ in range(n + 1)]

for i in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)

def bfs(st):
    vstd = [-1] * (n + 1)

    q = deque()
    q.append(st)
    vstd[st] = 0

    while q:
        node = q.popleft()

        for i in arr[node]:
            if vstd[i] == -1:
                vstd[i] = vstd[node] + 1
                q.append(i)
    total = sum(vstd)
    return total

mm = 5000
ans = 0
for i in range(1, n + 1):
    total = bfs(i)
    if total < mm:
        mm = total
        ans = i

print(ans)