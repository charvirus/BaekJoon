import sys

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline

n = int(input())

gph = [[] for i in range(n + 1)]

for i in range(n - 1):
    a, b = map(int, input().split())
    gph[a].append(b)
    gph[b].append(a)

vst = [0] * (n + 1)

def dfs(s):
    for i in gph[s]:
        if vst[i] == 0:
            vst[i] = s
            dfs(i)

dfs(1)

for i in range(2,n+1):
    print(vst[i])