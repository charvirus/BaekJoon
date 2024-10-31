import sys

input = sys.stdin.readline

n, m = map(int, input().split())
if (n-1) % (m+1) != 0:
    print("Can win")
else:
    print("Can't win")
