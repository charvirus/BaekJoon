import sys
from collections import deque

input = sys.stdin.readline

T = int(input())
for i in range(T):
    N = int(input())
    deq = deque(list(input().split()))
    pop = deq.popleft()
    result = deque(pop)

    while deq:
        ch = deq.popleft()
        if ord(pop) < ord(ch):
            result.append(ch)
        else:
            result.appendleft(ch)
            pop = ch

    print(''.join(result))
