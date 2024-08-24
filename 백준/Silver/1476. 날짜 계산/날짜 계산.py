import sys

input = sys.stdin.readline

E, S, M = map(int, input().split())

cnt = 0
te, ts, tm = 0, 0, 0
while True:
    te += 1
    ts += 1
    tm += 1
    cnt += 1
    if te > 15:
        te = 1
    if ts > 28:
        ts = 1
    if tm > 19:
        tm = 1
    if te == E and ts == S and tm == M:
        print(cnt)
        break
