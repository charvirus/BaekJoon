import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline
def dfs(d):
    global cnt
    visited[d] = True
    answer[d] = cnt
    graph[d].sort(reverse=True)
    for i in graph[d]:
        if not visited[i]:
            cnt += 1
            dfs(i)

N,M,R = map(int,input().split())

graph = [[]for i in range(N+1)]
visited = [False] * (N+1)
answer = [0] * (N+1)
cnt = 1
for i in range(M):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

dfs(R)

for i in answer[1:]:
    print(i)