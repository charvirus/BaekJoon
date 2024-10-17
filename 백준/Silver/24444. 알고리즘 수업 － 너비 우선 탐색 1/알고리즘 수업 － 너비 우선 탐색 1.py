import sys
from collections import deque
input = sys.stdin.readline
def BFS(v):
    global cnt
    queue =  deque([v])
    vstd[v] = 1
    while queue:
        d = queue.popleft()
        for i in sorted(smap[d]):
            if vstd[i] == 0:
                queue.append(i)
                cnt += 1
                vstd[i] = cnt

N, M, V = map(int, input().split())
smap = [[] for i in range(N + 1)]
vstd = [0] * (N + 1)
cnt = 1

for i in range(M):
    a, b = map(int, input().split())
    smap[a].append(b)
    smap[b].append(a)

BFS(V)
print(*vstd[1:], sep='\n')