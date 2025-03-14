from collections import deque

n, k = map(int, input().split())

max_num = 100000

vstd = [0] * (max_num + 1)


def bfs():
    q = deque()
    q.append(n)
    while q:
        x = q.popleft()

        if x == k:
            print(vstd[x])
            break
        for j in (x-1,x+1,x*2):
            if 0 <= j <= max_num and not vstd[j]:
                vstd[j] = vstd[x]+1
                q.append(j)

bfs()