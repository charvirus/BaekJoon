import sys
from collections import deque
input = sys.stdin.readline

N, K = map(int, input().split())

arr = deque([i for i in range(1, N + 1)])

print("<",end="")
while len(arr) != 1:
    for i in range(K-1):
        arr.append(arr.popleft())
    print(f"{arr.popleft()}, ",end="")
print(f"{arr.popleft()}>")