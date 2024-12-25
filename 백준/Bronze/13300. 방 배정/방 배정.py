import math
import sys

input = sys.stdin.readline

N, Y = map(int, input().split())
cnt = 0

room = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
for i in range(N):
    a, b = map(int, input().split())
    room[a * 6 + (b - 1)] += 1
for i in room:
    cnt += math.ceil(i / Y)
print(cnt)
