import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def bfs(s):
    vst = [-1] * (n + 1)

    q = deque()
    q.append(s)
    vst[s] = 0

    while q:
        nd = q.popleft()
        for i in graph[nd]:
            if vst[i] == -1:
                vst[i] = vst[nd] +1
                q.append(i)
    return sum(vst)
ans = 5000
r=0
for i in range(1, n + 1):
    t = bfs(i)
    if ans > t:
        r = i
        ans = t
print(r)