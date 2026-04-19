import sys
from collections import deque

input = sys.stdin.readline


def bfs(v):
    q = deque()
    q.append(v)
    chk[v] = 0
    while q:
        nd = q.popleft()
        for i in mp[nd]:
            if chk[i] == -1:
                q.append(i)
                chk[i] = chk[nd] + 1


n, m = map(int, input().split())
mp = [[] for i in range(n + 1)]
chk = [-1] * (n + 1)
for i in range(m):
    x, y = map(int, input().split())
    mp[x].append(y)
bfs(1)
print(chk[n]if chk[n]else -1)