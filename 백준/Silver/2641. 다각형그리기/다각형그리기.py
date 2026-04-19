import sys
from collections import deque

input = sys.stdin.readline

cnt = 0
res = []

convert = lambda x: (x + 2) % 4 if x != 2 else 4

n = int(input())
shape = deque(map(int, input().split()))
rev_shape = deque(map(convert, shape))
rev_shape.reverse()

for i in range(int(input())):
    chk = deque(map(int, input().split()))
    tmp = chk.copy()

    for _ in range(n):
        if tmp == shape or tmp == rev_shape:
            cnt += 1
            res.append(chk)
            break
        tmp.rotate(1)
print(cnt)
for i in res:
    print(*i)