import sys

input = sys.stdin.readline
n, m = map(int, input().split())
x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())
if n == 1 or m == 1:
    print("YES" if x1 == x2 and y1 == y2 else "NO")
else:
    print("YES" if (x1 + x2) % 2 == (y1 + y2) % 2 else "NO")
