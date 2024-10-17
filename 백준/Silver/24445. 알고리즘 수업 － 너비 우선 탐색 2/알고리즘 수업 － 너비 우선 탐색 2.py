import sys

input = sys.stdin.readline

N, M, V = map(int, input().split())
smap = [[] for i in range(N + 1)]
vstd = [0] * (N + 1)
cnt = 1

for i in range(M):
    a, b = map(int, input().split())
    smap[a].append(b)
    smap[b].append(a)

queue = [V]
vstd[V] = 1
while len(queue) != 0:
    d = queue.pop(0)
    for i in sorted(smap[d],reverse=True):
        if not vstd[i]:
            queue.append(i)
            cnt += 1
            vstd[i] = cnt
print(*vstd[1:], sep='\n')
