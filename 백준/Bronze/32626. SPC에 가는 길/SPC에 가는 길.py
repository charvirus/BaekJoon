import sys

input = sys.stdin.readline

sx, sy = map(int, input().split())
ex, ey = map(int, input().split())
px, py = map(int, input().split())

if (sy == ey == py and min(sx, ex) < px < max(sx, ex)) or (sx == ex == px and min(sy, ey) < py < max(sy, ey)):
    print(2)
elif sx == ex or sy == ey:
        print(0)
else:
    print(1)
