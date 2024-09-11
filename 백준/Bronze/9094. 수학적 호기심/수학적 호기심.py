import sys

input = sys.stdin.readline

ans = sys.maxsize
n = int(input())
for i in range(n):
    n, m = map(int, input().split())
    cnt = 0
    for a in range(1, n + 1):
        for b in range(a + 1, n):
            if ((a ** 2 + b ** 2 + m) / (a * b)).is_integer():
                cnt += 1

    print(cnt)
