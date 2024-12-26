import sys

input = sys.stdin.readline

for i in range(int(input())):
    n, m = map(int, input().split())
    cnt = 0
    for i in range(n, m + 1):
        w = str(i)
        cnt += w.count('0')
    print(cnt)
