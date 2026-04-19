import math
import sys

input = sys.stdin.readline

N, Y = map(int, input().split())
cnt = 0

room = [0,0,0,0,0]
for i in range(N):
    a,b = map(int, input().split())
    if b == 1 or b == 2:
        room[0] += 1
    elif a == 0 and (b == 3 or b == 4):
        room[1] += 1
    elif a == 1 and (b == 3 or b == 4):
        room[2] += 1
    elif a == 0 and (b == 5 or b == 6):
        room[3] += 1
    else:
        room[4] += 1
for i in room:
    cnt += math.ceil(i/Y)
print(cnt)