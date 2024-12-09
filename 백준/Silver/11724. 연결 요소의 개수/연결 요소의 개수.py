import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(v):
    vst[v] = True
    for i in g[v]:
        if not vst[i]:
            dfs(i)

N, M = map(int, input().split())
g = [[] for i in range(N + 1)]
vst = [False] * (N + 1)
cnt = 0
for i in range(M):
    a, b = map(int, input().split())
    g[a].append(b)
    g[b].append(a)

for i in range(N):
    if not vst[i + 1]:
        dfs(i+1)
        cnt += 1
print(cnt)