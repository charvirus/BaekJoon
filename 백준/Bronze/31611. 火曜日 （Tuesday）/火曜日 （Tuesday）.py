import sys

input = sys.stdin.readline

n = int(input().strip())

if n % 7 == 2:
    print(1)
else:
    print(0)