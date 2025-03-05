import sys

input = sys.stdin.readline

for i in range(int(input())):
    s = int(input())
    l = sum(list(map(int, input().split())))
    day = 1
    while s >= l:
        day += 1
        l *= 4
    print(day)