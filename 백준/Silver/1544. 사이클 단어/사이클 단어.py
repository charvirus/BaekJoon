from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
lst = [input().rstrip() for i in range(n)]

for i in range(n):
    q = deque(lst[i])
    while 1:
        q.append(q.popleft())
        s="".join(q)
        if s == lst[i]:
            break
        if s in lst:
            idx = lst.index(s)
            lst.pop(idx)
            lst.insert(idx,lst[i])
print(len(set(lst)))