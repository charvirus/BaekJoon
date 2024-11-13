import sys

input = sys.stdin.readline
N = int(input())
result = 0

for _ in range(N):
    now, time = input().split()
    h, m = map(int, now.split(":"))
    current = h * 60 + m

    for i in range(int(time)):
        if 420 <= current < 1140:
            result += 10
            current += 1
        else:
            result += 5
            current += 1

        if current == 1440:
            current = 0

print(result)