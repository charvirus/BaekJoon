import sys

input = sys.stdin.readline


def bfs(v):
    global cnt
    queue = [v]
    vstd[v] = 1
    while queue:
        d = queue.pop(0)
        smap[d].sort(reverse=True)
        for i in smap[d]:
            if not vstd[i]:
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

bfs(V)
for i in vstd[1:]:
    print(i)
